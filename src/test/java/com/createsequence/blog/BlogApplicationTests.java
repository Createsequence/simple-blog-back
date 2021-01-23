package com.createsequence.blog;

import com.createsequence.blog.domain.BlogArticleEntity;
import com.createsequence.blog.mapper.BlogCategoryMapper;
import com.createsequence.blog.service.BlogArticleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
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
	
	public static Integer count;
	
	public static BlogArticleEntity entity = new BlogArticleEntity()
			.setAuthor("test")
			.setTitle("嘻嘻嘻")
			.setContent("这里是内容")
			.setExcerpt("这里是摘要");
	
	@Test
	void count() {
		count = blogArticleService.selectCount(null);
		Assertions.assertNotNull(count);
	}
	
	@Test
	void insert() {
		Assertions.assertEquals(1, blogArticleService.insert(entity));
	}
	
	@Test
	void delete() {
		Assertions.assertEquals(1, blogArticleService.deleteById(entity.getId()));
	}
	
	@Test
	void select() {
		List<BlogArticleEntity> list = blogArticleService.selectList(null);
		Assertions.assertEquals(count, list.size());
	}
}
