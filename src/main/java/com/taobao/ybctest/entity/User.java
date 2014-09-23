package com.taobao.ybctest.entity;

import java.io.Serializable;
/****
 * 
 * @author greatwqs
 * @date 2011-12-02
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String password;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
