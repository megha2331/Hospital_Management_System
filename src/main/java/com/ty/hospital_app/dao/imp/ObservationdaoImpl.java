package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Observationdao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Observation;

public class ObservationdaoImpl implements Observationdao{

	public Observation saveObservation(int eid, Observation observation)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();
			return observation;
		}
		else
		{
			return null;
		}
	}

	public Observation getObservationById(int oid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Observation observation=entityManager.find(Observation.class, oid);
		return observation;

	}

	public boolean deleteObservationById(int oid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation=entityManager.find(Observation.class, oid);
		if(observation!=null)
		{
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Observation updateObservation(int oid, Observation observation) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation1=entityManager.find(Observation.class, oid);
		if(observation1!=null)
		{
			observation1.setOname(observation.getOname());
			observation1.setrObservation(observation.getrObservation());
			entityTransaction.begin();
			entityManager.merge(observation1);
			entityTransaction.commit();
			return observation;
		}
		else
		{
			return null;
		}
	}

	public List<Observation> getAllObservation() 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Observation s");
		List<Observation> observation=query.getResultList();
		return observation;
	}

	public List<Observation> getObservationByDoctorName(String oname) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Observation s where s.oname=?1");
		query.setParameter(1, oname);
		List<Observation> observation=query.getResultList();
		return observation;
		
	}

}
