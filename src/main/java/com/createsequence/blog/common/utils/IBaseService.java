package com.createsequence.blog.common.utils;

import java.util.List;
import java.util.Map;

/**
 * 基础Service接口
 *
 * @author Created by Createsequence on 2021/1/14 15:10
 */
public interface IBaseService<T extends BaseEntity> {
	
	/**
	 * 添加
	 *
	 * @param t 添加
	 * @return int
	 * @author Created by Createsequence on 2021/1/14 17:00
	 */
	int insert(T t);
	
	/**
	 * 根据id删除
	 *
	 * @param id id
	 * @return int
	 * @author Created by Createsequence on 2021/1/14 16:16
	 */
	int deleteById(Long id);
	
	/**
	 * 根据条件删除
	 *
	 * @param map 字段参数
	 * @return int
	 * @author Created by Createsequence on 2021/1/14 16:15
	 */
	int deleteByMap(Map<String, Object> map);
	
	
	/**
	 * 根据id批量删除
	 *
	 * @param ids id集合
	 * @return int
	 * @author Created by Createsequence on 2021/1/14 16:22
	 */
	int deleteBatchIds(List<Long> ids);
	
	/**
	 * 根据id更新
	 *
	 * @param t 对象
	 * @return int
	 * @author Created by Createsequence on 2021/1/14 16:19
	 */
	int updateById(T t);
	
	/**
	 * 根据条件更新
	 *
	 * @param t 对象
	 * @param map 字段参数
	 * @return int
	 * @author Created by Createsequence on 2021/1/14 16:19
	 */
	int updateByMap(T t, Map<String, Object> map);
	
	/**
	 * 查询全部数据
	 *
	 * @param map 字段参数
	 * @return java.util.List<T>
	 * @author Created by Createsequence on 2021/1/14 17:08
	 */
	List<T> selectList(Map<String, Object> map);
	
	/**
	 * 根据条件查询列表
	 *
	 * @param map 字段参数
	 * @return com.createsequence.blog.common.utils.PageHelper
	 * @author Created by Createsequence on 2021/1/14 15:09
	 */
	PageHelper selectByPage(Map<String, Object> map);
	
	/**
	 * 根据id查询对象
	 *
	 * @param id id
	 * @return T
	 * @author Created by Createsequence on 2021/1/14 16:17
	 */
	T selectById(Long id);
	
	/**
	 * 根据条件查询对象
	 *
	 * @param map 字段参数
	 * @return T
	 * @author Created by Createsequence on 2021/1/14 15:14
	 */
	List<T> selectByMap(Map<String, Object> map);
	
	/**
	 * 根据条件查询条数
	 *
	 * @param map 字段参数
	 * @return java.lang.Integer
	 * @author Created by Createsequence on 2021/1/14 16:21
	 */
	Integer selectCount(Map<String, Object> map);
}
