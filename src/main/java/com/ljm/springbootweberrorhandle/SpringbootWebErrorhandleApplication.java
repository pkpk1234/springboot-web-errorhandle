package com.ljm.springbootweberrorhandle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SpringbootWebErrorhandleApplication extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorWithExceptions());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebErrorhandleApplication.class, args);
    }
}
