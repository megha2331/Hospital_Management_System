package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class UpdateHospital {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setHname("Sushruta");
		hospital.setWebsite("www.sushruta.com");
		
		HospitalService service=new HospitalService();
		Hospital hospital1=service.updateHospitalById(1, hospital);
		if(hospital1 != null)
		{
			System.out.println("Data update successfully");
		}
		else
		{
			System.out.println("No data is found");
		}
		
		
	}

}
