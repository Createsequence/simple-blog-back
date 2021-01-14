package com.createsequence.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.createsequence.blog.common.utils.BaseEntity;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 评论表
 *
 * @author Created by Createsequence on 2021/1/13 15:27
 */
@Data
@ToString(callSuper = true)
@Accessors(chain = true)
@TableName("blog_comment")
public class BlogCommentEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 父id
	 */
	private Long pid;
	
	/**
	 * 游客名称
	 */
	private String userName;
	
	/**
	 * 游客邮箱
	 */
	private String userMail;
	
	/**
	 * 评论文章id
	 */
	private Long articleId;
	
}
