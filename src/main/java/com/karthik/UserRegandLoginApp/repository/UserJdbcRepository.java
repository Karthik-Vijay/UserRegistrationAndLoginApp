package com.karthik.UserRegandLoginApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.karthik.UserRegandLoginApp.entity.User;

@Repository
public interface UserJdbcRepository extends CrudRepository<User,String>
{
	
}
