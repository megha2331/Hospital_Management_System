package com.ty.hospital_app.service;

import java.util.List;
import com.ty.hospital_app.dao.imp.EncounterdaoImpl;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService 
{
	public void saveEncounter(int bid, Encounter encounter )
	{
		EncounterdaoImpl daoImpl=new EncounterdaoImpl();
		Encounter encounter1=daoImpl.saveEncounter(bid, encounter);
		if(encounter1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Encounter getEncounterById(int eid)
	{
		EncounterdaoImpl daoImpl= new EncounterdaoImpl();
		Encounter encounter1=daoImpl.getEncounterById(eid);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	public void deleteEncounterById(int eid)
	{
		EncounterdaoImpl daoImpl= new EncounterdaoImpl();
		boolean flag=daoImpl.deleteEncounterById(eid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Encounter updateEncounterById(int eid, Encounter encounter)
	{
		EncounterdaoImpl daoImpl=new EncounterdaoImpl();
		Encounter encounter1=daoImpl.updateEncounter(eid, encounter);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;

		}

	}
	public List<Encounter> getAllEncounter() 
	{
		EncounterdaoImpl daoImpl=new EncounterdaoImpl();
		List<Encounter> encounter=daoImpl.getAllEncounter();
		if(encounter!=null)
		{
			return encounter;
		}
		else
		{
			return null;
		}
	}
}
