package com.mphasis;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.mphasis")
public class AppConfig {
}