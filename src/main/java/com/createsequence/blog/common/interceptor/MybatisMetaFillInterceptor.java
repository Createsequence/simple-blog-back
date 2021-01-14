package com.createsequence.blog.common.interceptor;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 插入数据自动注入元数据拦截器
 *
 * @author Created by Createsequence on 2021/1/14 14:56
 */
@Slf4j
@Component
public class MybatisMetaFillInterceptor implements MetaObjectHandler {
	
	@Override
	public void insertFill(MetaObject metaObject) {
		log.info("填充创建日期");
		this.strictInsertFill(metaObject, "createDate", LocalDateTime.class, LocalDateTime.now());
		this.strictUpdateFill(metaObject, "updateDate", LocalDateTime.class, LocalDateTime.now());
	}
	
	@Override
	public void updateFill(MetaObject metaObject) {
		this.strictUpdateFill(metaObject, "updateDate", LocalDateTime.class, LocalDateTime.now());
	}
}
