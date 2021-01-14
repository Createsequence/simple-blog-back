package com.createsequence.blog;

import com.createsequence.blog.domain.BlogArticleEntity;
import com.createsequence.blog.mapper.BlogCategoryMapper;
import com.createsequence.blog.service.BlogArticleService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class BlogApplicationTests {
	
	@Autowired
	BlogCategoryMapper categoryMapper;
	
	@Autowired
	BlogArticleService blogArticleService;
	
	@Test
	void insert() {
		BlogArticleEntity entity = new BlogArticleEntity()
				.setAuthor("test")
				.setTitle("嘻嘻嘻")
				.setContent("这里是内容")
				.setExcerpt("这里是摘要");
		blogArticleService.insert(entity);
	}
	
	@Test
	void delete() {
		Assert.assertEquals(blogArticleService.deleteById(1349647930178506754L), 1);
	}
	
	@Test
	void select() {
		List<BlogArticleEntity> list = blogArticleService.selectList(null);
		Assert.assertEquals(list.size(), 0);
	}
}
