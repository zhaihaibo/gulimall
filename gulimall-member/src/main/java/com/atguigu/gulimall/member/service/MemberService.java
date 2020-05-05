package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:30:34
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

