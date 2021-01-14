package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogArticleEntity;
import com.createsequence.blog.mapper.BlogArticleMapper;
import com.createsequence.blog.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：huangchengxing
 * @Date：2021-01-14 14:51
 * @Description：<描述>
 */
@Service
public class BlogAritcleServiceImpl extends BaseService<BlogArticleEntity, BlogArticleMapper> implements BlogArticleService {
	
	@Autowired
	BlogArticleMapper blogArticleMapper;
	
	@Override
	protected BlogArticleMapper mapper() {
		return blogArticleMapper;
	}
}
