package com.createsequence.blog.controller;

import com.createsequence.blog.common.utils.Result;
import com.createsequence.blog.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 文章控制器
 *
 * @author Created by Createsequence on 2021/1/23 12:11
 */
@RequestMapping("/article/")
@RestController
public class BlogArticleController {
	
	@Autowired
	BlogArticleService blogArticleService;
	
	/**
	 * 查询列表
	 *
	 * @param map 查询参数
	 * @return com.createsequence.blog.common.utils.Result
	 * @author Created by Createsequence on 2021/1/23 16:10
	 */
	@GetMapping("list")
	public Result list(Map<String, Object> map) {
		return Result.ok().put("page", blogArticleService.selectByPage(map).convertToPageVo());
	}
	
}
