package com.createsequence.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.createsequence.blog.mapper")
public class BlogApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	
}
