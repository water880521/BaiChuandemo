package com.taobao.ybctest.ybctest;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.taobao.ybctest.dao.UserDaoInterface;
import com.taobao.ybctest.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

/**
 * 总的测试函数!
 * 
 * @author greatwqs
 * @date 2011-12-02
 */
public class MainTest {

	public static void main(String[] args) {
		// testSpringIbatis();
		testIbatis();
	}
	
	/***
	 * 使用纯Ibatis进行测试!
	 */
	public static void testIbatis() {
		String resource = "sqlMapConfig_ibatis.xml";
		Reader reader;
		SqlMapClient sqlMap = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
			sqlMap.startTransaction();
			User user = new User();
			user.setId("102");
			user.setName("EagleWang");
			user.setPassword("EaglePassword");
			user.setDescription("Email: greatwqs@163.com");
			sqlMap.insert("insertUser", user);
			sqlMap.commitTransaction();
			sqlMap.endTransaction();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用Spring结合进行测试Ibatis.
	 */
	public static void testSpringIbatis() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoInterface userDao = (UserDaoInterface) ac.getBean("userDaoProxy");
		try {
			User user = new User();
			user.setId("201");
			user.setName("greatwqs");
			user.setPassword("GreatPassword");
			user.setDescription("Email: greatwqs@126.com");
			userDao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
