package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogArticleReadEntity;
import com.createsequence.blog.mapper.BlogArticleReadMapper;
import com.createsequence.blog.service.BlogArticleReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章阅读量service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
@Service
public class BlogArticleReadServiceImpl extends BaseService<BlogArticleReadEntity, BlogArticleReadMapper> implements BlogArticleReadService {
	
	@Autowired
	private BlogArticleReadMapper blogArticleCategoryMapper;
	
	@Override
	protected BlogArticleReadMapper mapper() {
		return blogArticleCategoryMapper;
	}
}