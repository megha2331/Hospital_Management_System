package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObservationdaoImpl;
import com.ty.hospital_app.dto.Observation;

public class ObservationService 
{
	public void saveObservation(int eid, Observation observation)
	{
		ObservationdaoImpl daoImpl=new ObservationdaoImpl();
		Observation observation1=daoImpl.saveObservation(eid, observation);
		if(observation1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Observation getObservationById(int oid)
	{
		ObservationdaoImpl daoImpl=new ObservationdaoImpl();
		Observation observation1=daoImpl.getObservationById(oid);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	public void deleteObserVationById(int oid)
	{
		ObservationdaoImpl daoImpl=new ObservationdaoImpl();
		boolean flag=daoImpl.deleteObservationById(oid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Observation updateObservationById(int oid, Observation observation)
	{
		ObservationdaoImpl daoImpl=new ObservationdaoImpl();
		Observation observation1=daoImpl.updateObservation(oid, observation);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;

		}
	}
	public List<Observation> getAllObservation() 
	{
		ObservationdaoImpl daoImpl=new ObservationdaoImpl();
		List<Observation> observation=daoImpl.getAllObservation();
		if(observation!=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	public List<Observation> getObservationByDoctorName(String oname)
	{
		ObservationdaoImpl daoImpl=new ObservationdaoImpl();
		List<Observation> observation=daoImpl.getObservationByDoctorName(oname);
		if(observation!=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}

}

