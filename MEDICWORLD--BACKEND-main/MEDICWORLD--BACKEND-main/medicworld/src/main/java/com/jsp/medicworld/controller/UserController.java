package com.jsp.medicworld.controller;

import java.util.List;

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
	
	@PostMapping("/save")
	public User save(@RequestBody User user)
	{
		return ser.save(user);
	}
	@PutMapping("/forgot/{id}")
	public User forgot(@RequestBody User user,@PathVariable int id)
	{
		return ser.forgot(user, id);
	}
	
	@GetMapping("/getusermail/{usermail}")
	public String getusermail(@PathVariable String usermail)
	{
		return ser.getmail(usermail);
	}
	
	@PutMapping("/forgott/{email}")
	public User updateusingemail(@RequestBody User user,@PathVariable String email)
	{
		return ser.updateusingemail(user, email);
	}
	
	@GetMapping("/getall")
	public List<User> getall()
	{
		return ser.getall();
	}
	
	@GetMapping("/getbymail/{email}")
	public User getbymail(@PathVariable String email)
	{
		return ser.getObject(email);
	}
}
