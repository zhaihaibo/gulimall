package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@author  zhaihaibo
@data 2020/5/5 - 23:02
*/
//注解作用：告诉clou这个接口是一个远程调用的客户端
@Repository
@FeignClient("gulimall-coupon")  //括号里写需要调用的暴露的服务名
public interface CouponFeignService {

    //只需要写上需要调用的接口 或者 url
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
