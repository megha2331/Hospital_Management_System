package com.ty.hospital_app.controll;

import com.ty.hospital_app.service.HospitalService;

public class DeleteHospital {

	public static void main(String[] args) {
		HospitalService service=new HospitalService();
		service.deleteHospitalById(6);

	}

}
