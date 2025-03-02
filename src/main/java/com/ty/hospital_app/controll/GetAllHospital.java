package com.ty.hospital_app.controll;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class GetAllHospital {

	public static void main(String[] args) 
	{
		HospitalService service=new HospitalService();
		List<Hospital> list=service.getAllHospital();
		if(list.size()>0)
		{
			for(Hospital hospital : list)
			{
				List<Branch> list1=hospital.getBranches();
				System.out.println("Hospital Id        :" +hospital.getHid());
				System.out.println("Hospital Name      :" +hospital.getHname());
				System.out.println("Hospital Website   :" +hospital.getWebsite());
				System.out.println("------------------------------------------------");
				for(Branch branch : list1)
				{
					System.out.println("Branch Id     :" + branch.getBid());
					System.out.println("Branch Name   :" + branch.getBname());
					System.out.println("Branch Email  :" + branch.getEmail());
					System.out.println("Branch Phone  :" + branch.getPhone());	
					System.out.println("----------------------------------------");
				}
			}
		}
		else
		{
			System.out.println("No data is found");
		}
	}
}
