package com.jsp.medicworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.medicworld.entity.User;
import com.jsp.medicworld.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService ser;
	
	//http://localhost:9091/save
	@PostMapping("/save")
	public User save(@RequestBody User user)
	{
		return ser.save(user);
	}
	
	//http://localhost:9091/forgot/1
	@PutMapping("/forgot/{id}")
	public User forgot(@RequestBody User user,@PathVariable int id)
	{
		return ser.forgot(user, id);
	}
	
	//http://localhost:9091/getusermail/sushmargowda27@gmail.com
	@GetMapping("/getusermail/{usermail}")
	public String getusermail(@PathVariable String usermail)
	{
		return ser.getmail(usermail);
	}
	
	//http://localhost:9091/forgott/sushmargowda27@gmail.com
	@PutMapping("/forgott/{email}")
	public User updateusingemail(@RequestBody User user,@PathVariable String email)
	{
		return ser.updateusingemail(user, email);
	}
	
	
}
