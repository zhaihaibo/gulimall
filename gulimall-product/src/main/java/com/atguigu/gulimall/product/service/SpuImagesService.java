package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-03 18:55:34
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

