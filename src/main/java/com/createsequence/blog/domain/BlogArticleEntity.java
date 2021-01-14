package com.createsequence.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.createsequence.blog.common.utils.BaseEntity;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文章表
 *
 * @author Created by Createsequence on 2021/1/13 15:27
 */
@Data
@ToString(callSuper = true)
@Accessors(chain = true)
@TableName("blog_article")
public class BlogArticleEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 文章状态，0未发布1发布
	 */
	private Integer status;
	
	/**
	 * 摘要
	 */
	private String excerpt;
	
	/**
	 * 作者
	 */
	private String author;
	
	/**
	 * 正文
	 */
	private String content;
	
}
