package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-03 18:55:34
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
