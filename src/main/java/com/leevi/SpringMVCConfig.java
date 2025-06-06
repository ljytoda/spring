package com.leevi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// 在springconfig中配置的spring扫描路径去除了controller的扫描，但是configuration注释的类仍然会被spring加载，需要将配置类移动到上层目录中
@Configuration
@ComponentScan("com.leevi.controller")
//开启json转换为对象的功能
@EnableWebMvc
public class SpringMVCConfig {
}
