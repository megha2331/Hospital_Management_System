package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Persondao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Person;

public class PersondaoImpl implements Persondao
{

	public Person savePerson(int eid, Person person) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}
	}

	public Person getPersonById(int pid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, pid);
		return person;
	}

	public boolean deletePersonById(int pid) 
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, pid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePerson(int pid, Person person) 
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1=entityManager.find(Person.class,pid);
		if(person1!=null)
		{
			person1.setAge(person.getAge());
			person1.setPhone(person.getPhone());
			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}
	}

	public List<Person> getAllPerson() 
	{
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByGender(String gender) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where s.gender=?1");
		query.setParameter(1, gender);
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByAge(int age) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where s.age=?1");
		query.setParameter(1, age);
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByPhone(long phone) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where s.phone=?1");
		query.setParameter(1, phone);
		List<Person> person=query.getResultList();
		return person;
	}
}
