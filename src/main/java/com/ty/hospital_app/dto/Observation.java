package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String oname;
	private String rObservation;

	@ManyToOne
	@JoinColumn
	private Encounter encounters;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getrObservation() {
		return rObservation;
	}

	public void setrObservation(String rObservation) {
		this.rObservation = rObservation;
	}

	public Encounter getEncounters() {
		return encounters;
	}

	public void setEncounters(Encounter encounters) {
		this.encounters = encounters;
	}

}
