package com.xsw.mybatis.mapper;

import java.util.List;

import com.xsw.mybatis.pojo.User;

public interface UserMapper {

	public int insert(User user);
	public User selectByPrimaryKey(int id);
	public List<User> selectUsers();
	public int delete(int id);
	public int updateByPrimaryKey(User user);
}
