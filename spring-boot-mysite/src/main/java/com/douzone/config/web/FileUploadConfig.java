package com.douzone.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class FileUploadConfig extends WebMvcConfigurerAdapter{
	
	// 
	// Resources Mapping to URL
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.
			addResourceHandler("/uploads/images/**").
			addResourceLocations("file:/uploads/");
	}
	
	
	
}
