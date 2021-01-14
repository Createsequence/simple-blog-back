package com.createsequence.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.createsequence.blog.common.utils.BaseEntity;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 用户配置表
 *
 * @author Created by Createsequence on 2021/1/13 15:27
 */
@Data
@ToString(callSuper = true)
@Accessors(chain = true)
@TableName("blog_config")
public class BlogConfigEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 博客主题
	 */
	private String title;
	
	/**
	 * 分页条数
	 */
	private Integer pageSize;
	
	/**
	 * 设置为关于的文章id
	 */
	private Long aboutId;
	
	/**
	 * 摘要长度（不超过250）
	 */
	private Integer abstractLenth;
	
	/**
	 * 为无摘要文章自动截取摘要，0不开启，1开启
	 */
	private Integer autoAbstract;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 博客链接
	 */
	private String blog;
	
	/**
	 * github链接
	 */
	private String github;
	
	/**
	 * 座右铭
	 */
	private String motto;
	
	/**
	 * 头像
	 */
	private String img;
	
}
