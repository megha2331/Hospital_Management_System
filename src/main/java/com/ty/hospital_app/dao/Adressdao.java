package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Adress;


public interface Adressdao 
{
	public Adress saveAdress(int bid, Adress adress);
	public Adress getAdressById(int aid);
	public boolean deleteAdressById(int aid);
	public Adress updateAdress(int aid, Adress adress);
	public List<Adress> getAdressAll();
	

}
