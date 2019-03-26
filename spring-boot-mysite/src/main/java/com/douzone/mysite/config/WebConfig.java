package com.douzone.mysite.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.config.web.FileUploadConfig;
import com.douzone.config.web.SecurityConfig;

@Configuration
@Import(value= {SecurityConfig.class, FileUploadConfig.class})
public class WebConfig {
}