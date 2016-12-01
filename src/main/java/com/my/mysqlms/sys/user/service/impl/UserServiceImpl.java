package com.my.mysqlms.sys.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.mysqlms.sys.user.entity.User;
import com.my.mysqlms.sys.user.mapper.UserMapper;
import com.my.mysqlms.sys.user.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.findAllUsers();
	}

	@Override
	public User findUserbyId(Long id) {
		// TODO Auto-generated method stub
		return userMapper.findUserbyId(id);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userMapper.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		User user1 =userMapper.findUserbyId(user.getId());
		
		user1.setName(user.getName());
		user1.setAge(user.getAge());
		
		userMapper.updateUser(user1);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(id);
	}

}
