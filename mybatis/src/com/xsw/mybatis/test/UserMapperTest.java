package com.xsw.mybatis.test;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.xsw.mybatis.mapper.UserMapper;
import com.xsw.mybatis.pojo.User;
import com.xsw.mybatis.utils.MyBatisUtil;

public class UserMapperTest {

	@Test
	public void testInsert() {
		system.out.println("我是真的帅啊!");
		SqlSession session = MyBatisUtil.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = new User("向思文","1234",18);
		System.out.println("-------------------"+user);
		int row = userMapper.insert(user);
		System.out.println(row);
		System.out.println("-------------------"+user);
		session.commit();
		session.close();
	}
	
	@Test
	public void testSelectOne() throws Exception {
		SqlSession session = MyBatisUtil.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
		session.close();
		
	}
	@Test
	public void testSelectUsers() throws Exception {
		SqlSession session = MyBatisUtil.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<User> list = userMapper.selectUsers();
		for (User user : list) {
			System.out.println(user);
		}
		session.close();
	}
	@Test
	public void testdeleteUsers() throws Exception {
		SqlSession session = MyBatisUtil.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		int flag = userMapper.delete(12);
		
		System.out.println(flag);
		session.commit();
		session.close();
	}
	@Test
	public void testUpdateUser() throws Exception {
		SqlSession session = MyBatisUtil.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = new User(14,"李小慧", "1234", 21);
		int flag = userMapper.updateByPrimaryKey(user);
		
		System.out.println(flag);
		session.commit();
		session.close();
	}

}
