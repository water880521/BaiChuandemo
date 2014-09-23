package com.taobao.ybctest.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.taobao.ybctest.entity.User;
/****
 * 
 * @author greatwqs
 * @date 2011-12-02
 */
public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDaoInterface{
	
	/**
	 * 在classpath中通过通配符insert*配置transactionManager.设置事务!
	 */
	public void insertUser(User user) {
		this.getSqlMapClientTemplate().update("insertUser", user);
	}
}
