package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-03 18:55:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
