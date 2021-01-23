package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogArticleCategoryEntity;
import com.createsequence.blog.mapper.BlogArticleCategoryMapper;
import com.createsequence.blog.service.BlogArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章分类service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
@Service
public class BlogArticleCategoryServiceImpl extends BaseService<BlogArticleCategoryEntity, BlogArticleCategoryMapper> implements BlogArticleCategoryService {
	
	@Autowired
	private BlogArticleCategoryMapper blogArticleCategoryMapper;
	
	@Override
	protected BlogArticleCategoryMapper mapper() {
		return blogArticleCategoryMapper;
	}
}
