package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface Userdao 
{
	public User saveUser(User user);
	public User getUserById(int uid);
	public boolean deleteUserById(int uid);
	public User updateUser(int uid, User user);
	public List<User> getAllUser();
	public List<User> getUserByRole(String role);


}
