package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.EncounterService;

public class SaveEncounter {

	public static void main(String[] args) {
		Encounter encounter=new Encounter();
		EncounterService service=new EncounterService();
		encounter.setDateOfjoin(20);
		encounter.setDischarge(25);
	    service.saveEncounter(1, encounter);

	}

}
