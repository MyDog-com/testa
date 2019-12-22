package com.xsw.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private MyBatisUtil() {
	};

	private static SqlSessionFactory factory;

	static {
		String resource = "mybatis-config.xml";

		try (InputStream inputStream = Resources.getResourceAsStream(resource);) {
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static SqlSession openSession() {
		SqlSession session = factory.openSession();

		return session;
	}
}
