package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogTagEntity;
import com.createsequence.blog.mapper.BlogTagMapper;
import com.createsequence.blog.service.BlogTagService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 文章标签service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
public class BlogTagServiceImpl extends BaseService<BlogTagEntity, BlogTagMapper> implements BlogTagService {
	
	@Autowired
	BlogTagMapper blogTagMapper;
	
	@Override
	protected BlogTagMapper mapper() {
		return blogTagMapper;
	}
}