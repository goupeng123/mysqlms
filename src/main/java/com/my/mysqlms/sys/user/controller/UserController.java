package com.my.mysqlms.sys.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.mysqlms.sys.user.entity.User;
import com.my.mysqlms.sys.user.service.UserService;

@Controller
@RequestMapping(value="sys/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value="findAll")
	public String findAll(ModelMap map){
		
		List<User> users = userService.findAllUsers();
		
		map.put("users",users);
		return "list";
	}
	
	
	@RequestMapping(value="findById")
	public String findById(Long id,ModelMap map){
		
		User user = userService.findUserbyId(id);
		
		map.put("user", user);
		
		return "";
	}
	
	@RequestMapping(value="tzadd")
	public String tzadd(){
		
		return "add";
	}
	
	@RequestMapping(value="saveUser")
	public String saveUser(User user){
		
		userService.saveUser(user);
		
		return "redirect:/sys/user/findAll.html";
	}
	
	@RequestMapping(value="findTzUpdate")
	public String findTzUpdate(Long id,ModelMap map){
		
		User user = userService.findUserbyId(id);
		
		map.put("user", user);
		return "edit";
	}
	
	@RequestMapping(value="updateUser")
	public String updateUser(User user){
		
		userService.updateUser(user);
		
		return "redirect:/sys/user/findAll.html";
	}
	
	@RequestMapping(value="deleteUser")
	public String deleteUser(Long id){
		
		userService.deleteUser(id);
		
		return "redirect:/sys/user/findAll.html";
	}
}
