package com.createsequence.blog.common.exception;

/**
 * 基础异常类
 *
 * @author Created by Createsequence on 2021/1/14 14:44
 */
public class BlogException extends RuntimeException {
	
	/**
	 * 构造方法
	 *
	 * @param message 错误消息
	 * @author Created by Createsequence on 2021/1/23 11:37
	 */
	public BlogException(String message) {
		super(message);
	}
	
	/**
	 * 构造方法
	 *
	 * @param message 错误消息
	 * @param cause 异常
	 * @author Created by Createsequence on 2021/1/23 11:38
	 */
	public BlogException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * 构造方法
	 *
	 * @param cause 异常
	 * @author Created by Createsequence on 2021/1/23 11:39
	 */
	public BlogException(Throwable cause) {
		super(cause);
	}
	
}
