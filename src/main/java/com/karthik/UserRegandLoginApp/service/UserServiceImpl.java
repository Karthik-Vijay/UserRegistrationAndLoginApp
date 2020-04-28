package com.karthik.UserRegandLoginApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.karthik.UserRegandLoginApp.entity.Login;
import com.karthik.UserRegandLoginApp.entity.User;
import com.karthik.UserRegandLoginApp.repository.UserJdbcRepository;

import Exceptions.UserLoginExceptions;

@Component
public class UserServiceImpl implements UserService {
	// private PasswordEncoder passwordEncoder;

	@Autowired
	public UserJdbcRepository userjdbcrepository;
    // CONSTRUCTOR DEPENDENCY INJECTION FOR repository
	public UserServiceImpl(UserJdbcRepository userjdbcrepository) {
		this.userjdbcrepository = userjdbcrepository;
	}

	public void register(User user) {
		// user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println("register success");
		userjdbcrepository.save(user);
	}

	public Boolean login(Login userLogin) {
		Optional<User> userVal = userjdbcrepository.findById(userLogin.getUsername());
		if (userVal.get() != null) {
			if (userVal.get().getUsername().equals(userLogin.getUsername()) && 
					userVal.get().getPassword().equals(userLogin.getPassword())) {
				System.out.println(userLogin.getUsername());
				return true;
			} else {
				throw new UserLoginExceptions("Username and Password does not match");
			}
		} else {
			throw new UserLoginExceptions("This user does not exist");
		}
	}
	
	public User update(User user) {
		return userjdbcrepository.save(user);
	}
}
