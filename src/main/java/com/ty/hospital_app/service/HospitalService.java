package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.HospitaldaoImpl;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService 
{
	public void saveHospital(Hospital hospital)
	{
		HospitaldaoImpl daoImpl=new HospitaldaoImpl();
		Hospital hospital1=daoImpl.saveHospital(hospital);
		if(hospital1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Hospital getHospitalById(int hid)
	{
		HospitaldaoImpl daoImpl=new HospitaldaoImpl();
		Hospital hospital1=daoImpl.getHospitalById(hid);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
	public void deleteHospitalById(int hid)
	{
		HospitaldaoImpl daoImpl=new HospitaldaoImpl();
		boolean flag=daoImpl.deleteHospitalById(hid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Hospital updateHospitalById(int hid, Hospital hospital)
	{
		HospitaldaoImpl daoImpl=new HospitaldaoImpl();
		Hospital hospital1=daoImpl.updateHospital(hid, hospital);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
	public List<Hospital> getAllHospital()
	{
		HospitaldaoImpl daoImpl=new HospitaldaoImpl();
		return daoImpl.getAllHospital();
		
	}
	
}
