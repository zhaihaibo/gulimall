package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:30:34
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
