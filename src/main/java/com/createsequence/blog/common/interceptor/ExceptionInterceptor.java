package com.createsequence.blog.common.interceptor;

import com.createsequence.blog.common.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常拦截器
 *
 * @author Created by Createsequence on 2021/1/14 14:46
 */
@ControllerAdvice
@ResponseBody
public class ExceptionInterceptor {
	
	@ExceptionHandler(value = Exception.class)
	public Result exceptionHandler(HttpServletRequest request, Exception e) {
		return Result.error(e.getMessage());
	}
	
}
