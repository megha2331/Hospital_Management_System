package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AdressdaoImpl;

import com.ty.hospital_app.dto.Adress;


public class AdressService 
{
	public void saveADress(int bid, Adress adress) 
	{
		AdressdaoImpl daoImpl=new AdressdaoImpl();
		Adress adress1=daoImpl.saveAdress(bid, adress);
		if(adress1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}	

	}
	public Adress getADreAdress(int aid)
	{
		AdressdaoImpl daoImpl= new AdressdaoImpl();
		Adress adress1=daoImpl.getAdressById(aid);
		if(adress1!=null)
		{
			return adress1;
		}
		else
		{
			return null;
		}
	}
	public void deleteAdressById(int aid)
	{
		AdressdaoImpl daoImpl= new AdressdaoImpl();
		boolean flag=daoImpl.deleteAdressById(aid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Adress updateAdressById(int aid, Adress adress)
	{
		AdressdaoImpl daoImpl=new AdressdaoImpl();
		Adress adress1=daoImpl.updateAdress(aid, adress);
		if(adress1!=null)
		{
			return adress1;
		}
		else
		{
			return null;
		}
	}
	public List<Adress> getAllAdress() 
	{
		AdressdaoImpl daoImpl=new AdressdaoImpl();
		List<Adress> adress=daoImpl.getAdressAll();
		if(adress!=null)
		{
			return adress;
		}
		else
		{
			return null;
		}

	}
}
