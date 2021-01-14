package com.createsequence.blog.common.utils;

import cn.hutool.core.map.MapUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

/**
 * 基础crud方法实现
 *
 * @author Created by Createsequence on 2021/1/14 17:18
 */
public abstract class BaseService<T extends BaseEntity, E extends BaseMapper<T>> implements IBaseService<T> {
	
	/**
	 * 获取mapper（子类的实现方法必须返回自己要用的mapper接口）
	 *
	 * @return E 要使用的mapper接口
	 * @author Created by Createsequence on 2021/1/14 16:26
	 */
	protected abstract E mapper();
	
	@Override
	public int insert(T t) {
		return mapper().insert(t);
	}
	
	/**
	 * 根据属性填充查询条件
	 *
	 * @param params 字段参数
     * @param queryWrapper 查询构造器
	 * @return void
	 * @author Created by Createsequence on 2021/1/14 16:31
	 */
	private void getQueryCondition(Map<String, Object> params, QueryWrapper<T> queryWrapper) {
		if (MapUtil.isEmpty(params)) {
			return;
		}
		
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			Object val = entry.getValue();
			if (val != null) {
				queryWrapper.eq(entry.getKey(), val);
			}
		}
	}
	
	@Override
	public int deleteById(Long id) {
		return mapper().deleteById(id);
	}
	
	@Override
	public int deleteByMap(Map<String, Object> map) {
		return mapper().deleteByMap(map);
	}
	
	@Override
	public int deleteBatchIds(List<Long> ids) {
		return mapper().deleteBatchIds(ids);
	}
	
	@Override
	public int updateById(T t) {
		return mapper().updateById(t);
	}
	
	@Override
	public int updateByMap(T t, Map<String, Object> map) {
		QueryWrapper<T> queryWrapper = new QueryWrapper<>();
		getQueryCondition(map, queryWrapper);
		return mapper().update(t, queryWrapper);
	}
	
	@Override
	public List<T> selectList(Map<String, Object> map) {
		QueryWrapper<T> queryWrapper = new QueryWrapper<>();
		getQueryCondition(map, queryWrapper);
		return mapper().selectList(queryWrapper);
	}
	
	@Override
	public PageHelper<Map<String, Object>> selectByPage(Map<String, Object> map) {
		PageHelper<Map<String, Object>> pageHelper = new PageHelper<>(map);
		QueryWrapper<T> queryWrapper = new QueryWrapper<>();
		getQueryCondition(map, queryWrapper);
		return mapper().selectMapsPage(pageHelper, queryWrapper);
	}
	
	@Override
	public T selectById(Long id) {
		return mapper().selectById(id);
	}
	
	@Override
	public List<T> selectByMap(Map<String, Object> map) {
		return mapper().selectByMap(map);
	}
	
	@Override
	public Integer selectCount(Map<String, Object> map) {
		QueryWrapper<T> queryWrapper = new QueryWrapper<>();
		getQueryCondition(map, queryWrapper);
		return mapper().selectCount(queryWrapper);
	}
	
	
}
