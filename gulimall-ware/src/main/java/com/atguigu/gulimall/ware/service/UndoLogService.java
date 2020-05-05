package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-05 16:43:38
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

