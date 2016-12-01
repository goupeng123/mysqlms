package com.my.mysqlms.sys.user.service;

import java.util.List;

import com.my.mysqlms.sys.user.entity.User;

public interface UserService {

	public List<User> findAllUsers();
	
	public User findUserbyId(Long id);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Long id);
	
}
