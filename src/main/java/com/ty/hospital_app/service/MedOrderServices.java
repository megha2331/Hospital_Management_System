package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.MedOrderdaoImpl;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderServices 
{
	public void saveMedOrder(int eid, MedOrder medOrder )
	{
		MedOrderdaoImpl daoImpl=new MedOrderdaoImpl();
		MedOrder medOrder1=daoImpl.saveMedOrder(eid, medOrder);
		if(medOrder1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public MedOrder getMedOrderById(int mid)
	{
		MedOrderdaoImpl daoImpl=new MedOrderdaoImpl();
		MedOrder medOrder1=daoImpl.getMedOrderById(mid);
		if(medOrder1!=null)
		{
			return medOrder1;
		}
		else
		{
			return null;
		}
	}
	public void deleteMedoOrderById(int mid)
	{
		MedOrderdaoImpl daoImpl=new MedOrderdaoImpl();
		boolean flag=daoImpl.deleteMedOrderById(mid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder)
	{
		MedOrderdaoImpl daoImpl=new MedOrderdaoImpl();
		MedOrder medOrder1=daoImpl.updateMedOrder(mid, medOrder);
		if(medOrder1!=null)
		{
			return medOrder1;
		}
		else
		{
			return null;

		}
	}
	public List<MedOrder> getAllMedOrder() 
	{
		MedOrderdaoImpl daoImpl=new MedOrderdaoImpl();
		List<MedOrder> medOrder=daoImpl.getAllMedOrder();
		if(medOrder!=null)
		{
			return medOrder;
		}
		else
		{
			return null;
		}
	}
	public List<MedOrder> getMedOrderByDoctorName(String dname)
	{
		MedOrderdaoImpl daoImpl=new MedOrderdaoImpl();
		List<MedOrder> medOrder=daoImpl.getMedOrderByDoctorname(dname);
		if(medOrder!=null)
		{
			return medOrder;
		}
		else
		{
			return null;
		}
	}
}
