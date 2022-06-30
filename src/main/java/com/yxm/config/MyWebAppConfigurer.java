package com.yxm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author panyang
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {

    /**
     * 服务访问不到图片，配置虚拟路径
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String property =System.getProperty("user.dir")+"\\src\\main\\resources\\public\\";
        String property1 = System.getProperty("user.dir")+"\\src\\main\\resources\\public\\images\\";
        registry.addResourceHandler("/public/**").addResourceLocations("file:"+property);
       /* registry.addResourceHandler("/pictures/**").addResourceLocations(property1);*/
    }

}
