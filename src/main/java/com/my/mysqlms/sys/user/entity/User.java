package com.my.mysqlms.sys.user.entity;

import java.io.Serializable;

/**
 * 用户实体
 * @author hello
 *
 */

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2558204252696791212L;

	private Long id;
	
	private String name;
	
	private Long age;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
	
	
	
}
