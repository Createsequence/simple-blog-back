package com.createsequence.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.createsequence.blog.common.utils.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文章分类表
 *
 * @author Created by Createsequence on 2021/1/13 15:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
@TableName("blog_category")
public class BlogCategoryEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 分类名称
	 */
	private String name;
	
}
