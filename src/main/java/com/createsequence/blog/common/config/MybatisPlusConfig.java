package com.createsequence.blog.common.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus配置类
 *
 * @author Created by Createsequence on 2021/1/14 13:49
 */
@Configuration
public class MybatisPlusConfig {
	
	/**
	 * 使用MybatisPlus分页插件
	 *
	 * @return com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
	 * @author Created by Createsequence on 2021/1/14 13:52
	 */
	@Bean
	public MybatisPlusInterceptor paginationInnerInterceptor() {
		return new MybatisPlusInterceptor();
	}
	
}
