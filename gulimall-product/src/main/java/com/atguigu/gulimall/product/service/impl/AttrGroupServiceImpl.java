package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.AttrGroupDao;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;
import com.atguigu.gulimall.product.service.AttrGroupService;
import org.springframework.util.ObjectUtils;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPageByCatId(Map<String, Object> params, Long catId) {
        IPage<AttrGroupEntity> page = null;
        if (catId == 0) {
            //如果id为空，则查询所有的所有信息
            page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    new QueryWrapper<AttrGroupEntity>()
            );
        } else {
            //如果catid不为空，先看params中是否有key：查询条件
            Object key = params.get("key");
            //如果为空，直接查询catId
            QueryWrapper<AttrGroupEntity> queryWrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_id", catId);
            //如果不为空，封装key的查询条件
            if (ObjectUtils.isEmpty(key)) {
                queryWrapper.and((x) -> {
                    x.eq("attr_group_id", key).or().like("attr_group_name", key);
                });
            }
            //查询结果封装为ipage
            page = this.page(new Query<AttrGroupEntity>().getPage(params), queryWrapper);
        }
        return new PageUtils(page);
    }

}