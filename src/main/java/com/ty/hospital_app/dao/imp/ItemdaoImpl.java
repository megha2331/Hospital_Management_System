package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Itemdao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemdaoImpl implements Itemdao {

	public Item saveItem(int mid, Item item) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medOrder=entityManager.find(MedOrder.class, mid);
		if(medOrder!=null)
		{
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		}
		else
		{
			return null;
		}
	}

	public Item getItemById(int id) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class, id);
		return item;
		
	}

	public boolean deleteItemById(int id) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class, id);
		if(item!=null)
		{
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Item updateItem(int id, Item item) 
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=entityManager.find(Item.class,id);
		if(item1!=null)
		{
			item1.setName(item.getName());
			item1.setCost(item.getCost());
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			return item;
		}
		else
		{
			return null;
		}
	}

	public List<Item> getAllItems() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Item s");
		List<Item> item=query.getResultList();
		return item;
	}

}
