package com.createsequence.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.createsequence.blog.common.utils.BaseEntity;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文章-分类中间表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-13 13:53:25
 */
@Data
@ToString(callSuper = true)
@Accessors(chain = true)
@TableName("blog_article_category")
public class BlogArticleCategoryEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 文章id
	 */
	private Long aritcleId;
	/**
	 * 分类id
	 */
	private Long categoryId;

}
