package com.guardian.guardianbackend.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Parking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_parking")
	private long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String password;
	
	@NotBlank
	private String cnpj;

	@Column(name="phone_number")
	private String phoneNumber;
	
	private double longitude;
	
	private double latitude;
	
	@NotNull
	@Column(name="opening_time")
	private Time openingTime;
	
	@NotNull
	@Column(name="closing_time")
	private Time closingTime;
	
	private String picture;
	
	@NotNull
	@Column(name ="qtd_parking_spot")
	private Integer qtdParkingSpot;

	public Parking() {}
	
	

	public long getID() {
		return id;
	}

	public void setID(long iD) {
		id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cNPJ) {
		cnpj = cNPJ;
	}

	public String getPhone_number() {
		return phoneNumber;
	}

	public void setPhone_number(String phone_number) {
		this.phoneNumber = phone_number;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Time getOpening_time() {
		return openingTime;
	}

	public void setOpening_time(Time opening_time) {
		this.openingTime = opening_time;
	}

	public Time getClosing_time() {
		return closingTime;
	}

	public void setClosing_time(Time closing_time) {
		this.closingTime = closing_time;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getQtd_parking_spot() {
		return qtdParkingSpot;
	}

	public void setQtd_parking_spot(Integer qtd_parking_spot) {
		this.qtdParkingSpot = qtd_parking_spot;
	}
	
	
	

}
