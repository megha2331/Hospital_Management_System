package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.PersondaoImpl;
import com.ty.hospital_app.dto.Person;

public class PersonService 
{
	public void savePerson(int eid, Person person)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		Person person1=daoImpl.savePerson(eid, person);
		if(person1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Person getPersonById(int pid)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		Person person1=daoImpl.getPersonById(pid);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	public void deletePersonById(int pid)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		boolean flag=daoImpl.deletePersonById(pid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Person updatePersonById(int pid, Person person)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		Person person1=daoImpl.updatePerson(pid, person);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;

		}
	}
	public List<Person> getAllPerson() 
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		List<Person> person=daoImpl.getAllPerson();
		if(person!=null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByGender(String gender)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		List<Person> person=daoImpl.getPersonByGender(gender);
		if(person!=null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByAge(int age)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		List<Person> person=daoImpl.getPersonByAge(age);
		if(person!=null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByPhone(long phone)
	{
		PersondaoImpl daoImpl=new PersondaoImpl();
		List<Person> person=daoImpl.getPersonByPhone(phone);
		if(person!=null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}


}
