package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Adressdao;
import com.ty.hospital_app.dto.Adress;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class AdressdaoImpl implements Adressdao{

	public Adress saveAdress(int bid, Adress adress) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.persist(adress);
			entityTransaction.commit();
			return adress;
		}
		else
		{
			return null;
		}
	}

	public Adress getAdressById(int aid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Adress adress=entityManager.find(Adress.class, aid);
		return adress;
	}

	public boolean deleteAdressById(int aid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Adress adress=entityManager.find(Adress.class, aid);
		if(adress!=null)
		{
			entityTransaction.begin();
			entityManager.persist(adress);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Adress updateAdress(int aid, Adress adress) 
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Adress adress1=entityManager.find(Adress.class,aid);
		if(adress1!=null)
		{
			adress.setStreat(adress1.getStreat());
			adress.setPin(adress1.getPin());
			entityTransaction.begin();
			entityManager.merge(adress);
			entityTransaction.commit();
			return adress;
		}
		else
		{
			return null;
		}
	}

	public List<Adress> getAdressAll() 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Adress s");
		List<Adress> adress=query.getResultList();
		return adress;
		
		
	}

}
