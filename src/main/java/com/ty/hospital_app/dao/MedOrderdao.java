package com.ty.hospital_app.dao;


import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderdao 
{
	public MedOrder saveMedOrder(int eid, MedOrder medOrder );
	public MedOrder getMedOrderById(int mid);
	public boolean deleteMedOrderById(int mid);
	public MedOrder updateMedOrder(int mid, MedOrder medOrder);
	public List<MedOrder> getAllMedOrder();
	public List<MedOrder> getMedOrderByDoctorname(String dname);
	
	//public List<MedOrder> getMedOrderByDate(String orderdate);

}
