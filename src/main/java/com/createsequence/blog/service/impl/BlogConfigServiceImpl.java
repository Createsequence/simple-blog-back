package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogConfigEntity;
import com.createsequence.blog.mapper.BlogConfigMapper;
import com.createsequence.blog.service.BlogConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章配置service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
@Service
public class BlogConfigServiceImpl extends BaseService<BlogConfigEntity, BlogConfigMapper> implements BlogConfigService {
	
	@Autowired
	BlogConfigMapper blogArticleMapper;
	
	@Override
	protected BlogConfigMapper mapper() {
		return blogArticleMapper;
	}
}