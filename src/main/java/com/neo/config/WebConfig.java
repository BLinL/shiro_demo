package com.neo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

 /* @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/userManager").setViewName("userManager");
    registry.addViewController("/userRoleManager").setViewName("userRoleManager");
    registry.addViewController("/userPermissionManager").setViewName("userPermissionManager");
  }*/
}
