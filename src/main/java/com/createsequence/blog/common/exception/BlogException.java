package com.createsequence.blog.common.exception;

/**
 * 基础异常类
 *
 * @author Created by Createsequence on 2021/1/14 14:44
 */
public class BlogException extends RuntimeException {
	public BlogException() {
	}
	
	public BlogException(String message) {
		super(message);
	}
	
	public BlogException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public BlogException(Throwable cause) {
		super(cause);
	}
	
	public BlogException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
