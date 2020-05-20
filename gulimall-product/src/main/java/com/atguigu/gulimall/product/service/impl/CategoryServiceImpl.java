package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    //封装一级菜单的一二三级菜单分类
    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        List<CategoryEntity> lv1Menu = categoryEntities.stream()
                .filter(x -> x.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, categoryEntities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());
        return lv1Menu;
    }

    //使用递归的方式获取当前菜单的子菜单  root--当前菜单    categoryEntities--所有的菜单
    //方法意义：要在所有的categoryEntities中 找到root菜单的子菜单
    public List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> categoryEntities) {

        List<CategoryEntity> children = categoryEntities.stream()
                //得到当前菜单的子菜单
                .filter(x -> {
                    return x.getParentCid() == root.getCatId();
                })
                //当前子菜单还可能有子菜单，此处使用递归，给当前子菜单的子菜单Children属性赋值
                .map(x -> {
                    x.setChildren(getChildrens(x, categoryEntities));
                    return x;
                })
                //子菜单排序
                .sorted((x1, x2) -> {
                    //此处的.get方法如果不进行判断会出现空指针异常
                    return (x1.getSort()==null?0:x1.getSort()) - (x2.getSort()==null?0:x2.getSort());
                })
                //收集为集合
                .collect(Collectors.toList());

        return children;
    }

}