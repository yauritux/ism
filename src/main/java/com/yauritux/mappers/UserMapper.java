package com.yauritux.mappers;

import java.util.List;

import com.yauritux.domain.User;

public interface UserMapper {

	public void insertUser(User user);
	
	//public User getUserById(Integer userId);
	public User getUserById(String userId);
	
	public User getUserByEmailId(String emailId);
	
	public List<User> getAllUsers();
	
	public void updateUser(User user);
	
	//public void deleteUser(Integer userId);
	public void deleteUser(String userId);
}
