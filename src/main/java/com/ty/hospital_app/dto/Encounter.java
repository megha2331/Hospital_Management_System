package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private int dateOfjoin;
	private int discharge;
	@OneToMany(mappedBy = "encounters")
	private List<Observation> observations;
	@ManyToOne
	@JoinColumn
	private Branch branchs;
	@OneToMany(mappedBy = "encounters")
	private List<MedOrder> medOrders;
	@ManyToOne
	@JoinColumn
	private Person persons;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getDateOfjoin() {
		return dateOfjoin;
	}
	public void setDateOfjoin(int dateOfjoin) {
		this.dateOfjoin = dateOfjoin;
	}
	public int getDischarge() {
		return discharge;
	}
	public void setDischarge(int discharge) {
		this.discharge = discharge;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
	public Branch getBranchs() {
		return branchs;
	}
	public void setBranchs(Branch branchs) {
		this.branchs = branchs;
	}
	public List<MedOrder> getMedOrders() {
		return medOrders;
	}
	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}
	public Person getPersons() {
		return persons;
	}
	public void setPersons(Person persons) {
		this.persons = persons;
	}
	
	
}