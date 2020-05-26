package com.atguigu.gulimall.product.entity;

import com.atguigu.common.valid.ListValue;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 品牌
 *
 * @author zhb
 * @email zhb@gmail.com
 * @date 2020-05-03 18:55:34
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "姓名不能为空")
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank(message = "图片不能为空")
    private String logo;
    /**
     * 介绍
     */
    @NotBlank(message = "描述不能为空")
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
//	@NotBlank(message = "开关状态不能为空")
    @ListValue(vals={0,1},message = "开关状态只能是0或1")
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotBlank(message = "首字母不能为空")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(message = "排序不能为空")
    private Integer sort;

}
