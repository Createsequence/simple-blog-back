package com.createsequence.blog.common.utils;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 基础类
 *
 * @author Created by Createsequence on 2021/1/14 15:02
 */
@Data
@Accessors(chain = true)
public class BaseEntity {
	
	/**
	 * 主键
	 */
	@TableId
	private Long id;
	
	/**
	 * 创建日期
	 */
	@TableField(fill = FieldFill.INSERT)
	private LocalDateTime createDate;
	
	/**
	 * 最后更新日期
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateDate;
	
	/**
	 * 逻辑删除标记，0否1是
	 */
	@TableLogic
	private Integer delFlag;
	
}
