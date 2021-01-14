package com.createsequence.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.createsequence.blog.common.utils.BaseEntity;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文章-标签中间表
 *
 * @author Created by Createsequence on 2021/1/13 15:27
 */
@Data
@ToString(callSuper = true)
@Accessors(chain = true)
@TableName("blog_article_tag")
public class BlogArticleTagEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 文章id
	 */
	private Long articleId;
	
	/**
	 * 标签id
	 */
	private Long tagId;

}
