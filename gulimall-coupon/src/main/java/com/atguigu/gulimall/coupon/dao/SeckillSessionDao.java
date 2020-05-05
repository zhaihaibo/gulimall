package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:20:57
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
