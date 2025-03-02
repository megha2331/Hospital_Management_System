package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Adress;
import com.ty.hospital_app.service.AdressService;

public class UpdateAdress {

	public static void main(String[] args) {
		Adress adress=new Adress();
		AdressService service=new AdressService();
		adress.setStreat("Kuvemu Streat");
		adress.setPin(2546);
		service.updateAdressById(1, adress);
	}

}
