package com.cktest.mapper;

import com.cktest.pojo.User;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 周周
 * @since 2020-05-21
 */
public interface UserMapper extends BaseMapper<User> {
	
	public List<User> findAll();

	

}
