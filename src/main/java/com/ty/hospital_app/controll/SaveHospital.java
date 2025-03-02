package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class SaveHospital {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		hospital.setHname("Suguna");
		hospital.setWebsite("www.suguna.com");
		service.saveHospital(hospital);

	}

}
