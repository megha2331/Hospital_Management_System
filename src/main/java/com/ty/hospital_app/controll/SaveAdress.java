package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Adress;
import com.ty.hospital_app.service.AdressService;

public class SaveAdress {

	public static void main(String[] args) {
		Adress adress=new Adress();
		AdressService service=new AdressService();
		adress.setPin(580028);
		adress.setStreat("R V Road");
		adress.setState("Karnataka");
		adress.setCountry("India");
		service.saveADress(1, adress);

	}
}
