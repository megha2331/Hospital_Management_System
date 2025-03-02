package com.ty.hospital_app.controll;

import java.util.List;

import com.ty.hospital_app.dto.Adress;
import com.ty.hospital_app.service.AdressService;

public class GetAdress {

	public static void main(String[] args) {
		AdressService service=new AdressService();
	    List<Adress> adress=service.getAllAdress();
	    
	}

}
