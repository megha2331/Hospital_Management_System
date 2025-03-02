package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Userdao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.User;

public class UserdaoImpl implements Userdao 
{

	public User saveUser(User user) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserById(int uid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User user=entityManager.find(User.class, uid);
		return user;
	}

	public boolean deleteUserById(int uid) 
	{

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, uid);
		if(user!=null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public User updateUser(int uid, User user)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user1=entityManager.find(User.class, uid);
		if(user1!=null)
		{
			user1.setEmail(user.getEmail());
			user1.setPhone(user.getPhone());
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return user;
		}
		else
		{
			return null;
		}
	}

	public List<User> getAllUser() 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from User s");
		List<User> user=query.getResultList();
		return user;
	}

	public List<User> getUserByRole(String role) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from User s where s.role=?1");
		query.setParameter(1, role);
		List<User> user=query.getResultList();
		return user;
	}

}
