package com.createsequence.blog.common.interceptor;

import com.createsequence.blog.common.exception.BlogException;
import com.createsequence.blog.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常拦截器
 *
 * @author Created by Createsequence on 2021/1/14 14:46
 */
@Slf4j
@ControllerAdvice
@ResponseBody
public class ExceptionInterceptor {
	
	/**
	 * 拦截业务异常
	 *
	 * @param request 响应
     * @param e 异常
	 * @return com.createsequence.blog.common.utils.Result
	 * @author Created by Createsequence on 2021/1/23 11:46
	 */
	@ExceptionHandler(value = BlogException.class)
	public Result exceptionHandler(HttpServletRequest request, Exception e) {
		log.error("业务异常！{}", e.getMessage());
		return Result.error(e.getMessage());
	}
	
	/**
	 * 拦截未知异常
	 *
	 * @param request 响应
	 * @param e 异常
	 * @return com.createsequence.blog.common.utils.Result
	 * @author Created by Createsequence on 2021/1/23 11:46
	 */
	@ExceptionHandler(value = Exception.class)
	public Result blogExceptionHandler(HttpServletRequest request, Exception e) {
		log.error("未知异常！{}", e.getMessage());
		return Result.error(e.getMessage());
	}
}
