package com.createsequence.blog.common.utils;

import cn.hutool.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/***
 * 响应对象
 *
 * @author Created by Createsequence on 2021/1/13 12:56
 */
public class Result {
	
	public static final String DEFAULT_SUCCESS_MSG = "success";
	
	public static final String DEFAULT_ERROR_MSG = "error";
	
	/**
	 * 响应码
	 */
	private int code;
	
	/**
	 * 信息
	 */
	private String msg;
	
	/**
	 * 数据
	 */
	private Map<String, Object> data;
	
	public Result(int code, String msg, Map<String, Object> data) {
		this.code = code;
		this.msg = msg;
		this.data = new HashMap<>(data);
	}
	
	public Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
		this.data = new HashMap<>();
	}
	
	public static Result ok() {
		return new Result(HttpStatus.HTTP_OK, DEFAULT_SUCCESS_MSG);
	}
	
	public static Result ok(Map<String, Object> data) {
		return new Result(HttpStatus.HTTP_OK, DEFAULT_SUCCESS_MSG, data);
	}
	
	public static Result ok(String msg) {
		return new Result(HttpStatus.HTTP_OK, msg);
	}
	
	public static Result error() {
		return new Result(HttpStatus.HTTP_OK, DEFAULT_ERROR_MSG);
	}
	
	public static Result error(Map<String, Object> data) {
		return new Result(HttpStatus.HTTP_OK, DEFAULT_ERROR_MSG, data);
	}
	
	public static Result error(String msg) {
		return new Result(HttpStatus.HTTP_OK, msg);
	}
	
	/**
	 * 链式添加元素
	 *
	 * @param key key
	 * @param val value
	 * @return com.createsequence.blog.common.utils.Result
	 * @author Created by Createsequence on 2021/1/13 15:50
	 */
	public Result put(String key, Object val) {
		this.data.put(key, val);
		return this;
	}
	
	/**
	 * 链式添加元素
	 *
	 * @param map 元素集合
	 * @return com.createsequence.blog.common.utils.Result
	 * @author Created by Createsequence on 2021/1/13 15:50
	 */
	public Result putAll(Map<String, Object> map) {
		this.data.putAll(map);
		return this;
	}
	
}
