package com.jsp.medicworld.service;

import com.jsp.medicworld.entity.User;

public interface UserService 
{
	public User save(User user);
	public User forgot(User user,int id);
	public User updateusingemail(User user, String email);
	public String getmail(String usermail);
}
