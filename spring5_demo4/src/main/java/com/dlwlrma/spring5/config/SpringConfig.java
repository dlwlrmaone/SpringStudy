package com.dlwlrma.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.dlwlrma.spring5")
@EnableAspectJAutoProxy(proxyTargetClass = true)//强制使用CGLIB代理
public class SpringConfig {

}
