package com.ty.hospital_app.controll;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class GetHospitalById {

	public static void main(String[] args) {
		HospitalService service=new HospitalService();
		Hospital hospital=service.getHospitalById(1);
		if(hospital != null) 
		{
			List<Branch> list=hospital.getBranches();
			System.out.println("Hospital Id      :" + hospital.getHid());
			System.out.println("Hospital Name    :" + hospital.getHname());
			System.out.println("Hospital website :" + hospital.getWebsite());
			System.out.println("-----------------------------------");
			
			for(Branch branch : list)
			{
				System.out.println("Branch Id       :" +branch.getBid());
				System.out.println("Branch Name     :" +branch.getBname());
				System.out.println("Branch Email    :" +branch.getEmail());
				System.out.println("Branch Phone    :" +branch.getPhone());
				System.out.println("-------------------------------------");

			}
		}
		else
		{
			System.out.println("No data is found");
		}
	}

}
