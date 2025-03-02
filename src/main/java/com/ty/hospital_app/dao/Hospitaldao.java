package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Hospital;

public interface Hospitaldao 
{
	public Hospital saveHospital(Hospital hospital);
	public Hospital getHospitalById(int hid);
	public boolean deleteHospitalById(int hid);
	public Hospital updateHospital(int hid, Hospital hospital);
	public List<Hospital> getAllHospital();

}
