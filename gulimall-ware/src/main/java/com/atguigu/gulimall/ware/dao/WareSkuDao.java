package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:43:38
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
