package com.ty.hospital_app.controll;

import com.ty.hospital_app.service.AdressService;

public class DeleteAdress {

	public static void main(String[] args) {
		AdressService service=new AdressService();
		service.deleteAdressById(1);

	}

}
