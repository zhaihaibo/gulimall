package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:30:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
