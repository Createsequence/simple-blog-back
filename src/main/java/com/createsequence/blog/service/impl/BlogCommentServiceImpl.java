package com.createsequence.blog.service.impl;

import com.createsequence.blog.common.utils.BaseService;
import com.createsequence.blog.domain.BlogCommentEntity;
import com.createsequence.blog.mapper.BlogCommentMapper;
import com.createsequence.blog.service.BlogCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章评论service
 *
 * @author Created by Createsequence on 2021/1/23 10:54
 */
@Service
public class BlogCommentServiceImpl extends BaseService<BlogCommentEntity, BlogCommentMapper> implements BlogCommentService {
	
	@Autowired
	BlogCommentMapper blogArticleMapper;
	
	@Override
	protected BlogCommentMapper mapper() {
		return blogArticleMapper;
	}
}