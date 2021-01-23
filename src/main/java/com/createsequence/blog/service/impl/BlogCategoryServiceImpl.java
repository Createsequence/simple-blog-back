package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogCategoryEntity;
import com.createsequence.blog.mapper.BlogCategoryMapper;
import com.createsequence.blog.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章分类service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
@Service
public class BlogCategoryServiceImpl extends BaseService<BlogCategoryEntity, BlogCategoryMapper> implements BlogCategoryService {
	
	@Autowired
	private BlogCategoryMapper blogArticleCategoryMapper;
	
	@Override
	protected BlogCategoryMapper mapper() {
		return blogArticleCategoryMapper;
	}
}