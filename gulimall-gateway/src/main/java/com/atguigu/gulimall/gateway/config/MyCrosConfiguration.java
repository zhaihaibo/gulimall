package com.atguigu.gulimall.gateway.config;

/*
@author  zhaihaibo
@data 2020/5/15 - 20:36
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

//在解决跨域问题时，可以使用springboot自带的一个解决跨域的接口 CorsWebFilter
@Configuration
public class MyCrosConfiguration {


    @Bean
    public CorsWebFilter corsWebFilter(){
//        CorsConfigurationSource是一个接口，使用它的实现类做配置
        UrlBasedCorsConfigurationSource corsConfig = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(true);
        corsConfig.registerCorsConfiguration("/**",corsConfiguration);

        //在CorsWebFilter中封装跨域配置信息
        return new CorsWebFilter(corsConfig);
    }
}
