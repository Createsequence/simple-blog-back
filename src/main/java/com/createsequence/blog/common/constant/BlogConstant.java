package com.createsequence.blog.common.constant;

/**
 * 常量
 *
 * @author Created by Createsequence on 2021/1/14 14:20
 */
public class BlogConstant {
	
	private BlogConstant() {
	}
	
	// ====================== 分页相关 ======================
	
	/**
	 * 总条数参数名
	 */
	public static final String TOTAL_COUNT = "totalCount";
	
	/**
	 * 每页条数参数名
	 */
	public static final String PAGE_SIZE = "page_size";
	
	/**
	 * 总页数参数名
	 */
	public static final String TOTAL_PAGE = "totalPage";
	
	/**
	 * 当前页数参数名
	 */
	public static final String PAGE_NUM = "pageNum";
	
	
	
	// ====================== 请求码相关 ======================
	
	/**
	 * 请求成功
	 */
	public static final int HTTP_SUCCESS = 200;
	public static final String DEFAULT_SUCCESS_MSG = "success";
	
	/**
	 * 服务器错误
	 */
	public static final int HTTP_SERVER_ERROR = 500;
	public static final String DEFAULT_ERROR_MSG = "error";
	
	/**
	 * 找不到资源
	 */
	public static final int HTTP_NOT_FOUND = 404;
	
	/**
	 * 没有权限
	 */
	public static final int HTTP_FORBIDDEN = 403;
	
}
