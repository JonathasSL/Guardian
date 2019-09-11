package com.guardian.guardianbackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private long id_driver;
	
	@NotNull
	private long id_vehicle_type;
	
	@NotBlank
	private String plate;
	
	@NotBlank
	private String make;
	
	@NotBlank
	private String model;
	
	private String picture;
	
	private String color;
	
	
	public Vehicle() {}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getId_driver() {
		return id_driver;
	}


	public void setId_driver(long id_driver) {
		this.id_driver = id_driver;
	}


	public long getId_vehicle_type() {
		return id_vehicle_type;
	}


	public void setId_vehicle_type(long id_vehicle_type) {
		this.id_vehicle_type = id_vehicle_type;
	}


	public String getPlate() {
		return plate;
	}


	public void setPlate(String plate) {
		this.plate = plate;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}
