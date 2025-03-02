package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.UserdaoImpl;
import com.ty.hospital_app.dto.User;

public class UserService 
{
	public void saveUser(User user)
	{
		UserdaoImpl daoImpl=new UserdaoImpl();
		User user1=daoImpl.saveUser(user);
		if(user1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public User getUserById(int uid)
	{
		UserdaoImpl daoImpl=new UserdaoImpl();
		User user1=daoImpl.getUserById(uid);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
	public void deleteUserById(int uid)
	{
		UserdaoImpl daoImpl=new UserdaoImpl();
		boolean flag=daoImpl.deleteUserById(uid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public User updateUserById(int uid, User user)
	{
		UserdaoImpl daoImpl=new UserdaoImpl();
		User user1=daoImpl.getUserById(uid);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
	public List<User> getAllUser()
	{
		UserdaoImpl daoImpl=new UserdaoImpl();
		List<User> user=daoImpl.getAllUser();
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	public List<User> getUserByRole(String role)
	{
		UserdaoImpl daoImpl=new UserdaoImpl();
		List<User> user=daoImpl.getUserByRole(role);
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}

}
