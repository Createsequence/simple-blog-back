package com.createsequence.blog.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.createsequence.blog.common.constant.BlogConstant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 分页工具类
 *
 * @author Created by Createsequence on 2021/1/13 15:57
 */
public class PageHelper extends Page<Map<String, Object>> implements IPage<Map<String, Object>> {
	
	/**
	 * 从参数中获取分页所需的相关参数
	 *
	 * @param params 前端的查询参数
	 * @author Created by Createsequence on 2021/1/14 14:34
	 */
	public PageHelper(Map<String, Object> params) {
		if (params.containsKey(BlogConstant.PAGE_NUM)) {
			this.current = (long) params.get(BlogConstant.PAGE_NUM);
		}
		if (params.containsKey(BlogConstant.PAGE_SIZE)) {
			this.size = (long) params.get(BlogConstant.PAGE_SIZE);
		}
		if (params.containsKey(BlogConstant.TOTAL_PAGE)) {
			this.total = (long) params.get(BlogConstant.TOTAL_PAGE);
		}
	}
	
	/**
	 * 将Page转为符合前端格式的分页对象
	 *
	 * @return com.createsequence.blog.common.utils.PageHelper<T>.PageVo<T>
	 * @author Created by Createsequence on 2021/1/14 14:31
	 */
	public PageVo convertToPageVo() {
		return new PageVo(this.getTotal(), this.getSize(), this.getPages(), this.getCurrent(), this.getRecords());
	}
	
	/**
	 * 分页视图类
	 *
	 * @author Created by Createsequence on 2021/1/14 14:14
	 */
	@Getter
	@Setter
	@NoArgsConstructor
	private static class PageVo implements Serializable {
		private static final long serialVersionUID = -4440483903124346532L;
		
		/**
		 * 总条数
		 */
		long totalCount;
		
		/**
		 * 每页条数
		 */
		long pageSize;
		
		/**
		 * 总页数
		 */
		long totalPage;
		
		/**
		 * 当前页数
		 */
		long pageNum;
		
		/**
		 * 数据
		 */
		transient List<?> data;
		
		public PageVo(long totalCount, long pageSize, long totalPage, long pageNum, List<?> data) {
			this.totalCount = totalCount;
			this.pageSize = pageSize;
			this.totalPage = totalPage;
			this.pageNum = pageNum;
			this.data = data;
		}
	}
	
}
