package com.leevi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//排除Controller注解的类有下面两种方法，为了让spring不会重复扫描加载spring mvc的controller被修饰的类
//@ComponentScan({"com.leevi.dao","com.leevi.service"})
@ComponentScan(value = "com.leevi",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
public class SpringConfig {
}
