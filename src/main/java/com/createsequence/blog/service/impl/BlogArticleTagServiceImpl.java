package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogArticleTagEntity;
import com.createsequence.blog.mapper.BlogArticleTagMapper;
import com.createsequence.blog.service.BlogArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章标签service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
@Service
public class BlogArticleTagServiceImpl extends BaseService<BlogArticleTagEntity, BlogArticleTagMapper> implements BlogArticleTagService {
	
	@Autowired
	private BlogArticleTagMapper blogArticleCategoryMapper;
	
	@Override
	protected BlogArticleTagMapper mapper() {
		return blogArticleCategoryMapper;
	}
}