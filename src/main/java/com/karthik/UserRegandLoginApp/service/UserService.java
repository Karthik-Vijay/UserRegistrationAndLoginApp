package com.karthik.UserRegandLoginApp.service;
import com.karthik.UserRegandLoginApp.entity.Login;
import com.karthik.UserRegandLoginApp.entity.User;

public interface UserService 
{
	void register(User user);
	
	public Boolean login(Login userLogin);

	User update(User user);
}
