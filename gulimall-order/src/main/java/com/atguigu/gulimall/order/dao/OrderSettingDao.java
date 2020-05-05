package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:40:18
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
