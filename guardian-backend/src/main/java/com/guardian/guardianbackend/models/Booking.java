package com.guardian.guardianbackend.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Booking {

	@Id
	@NotBlank
	private long id_vehicle;
	
	@NotBlank
	private long id_parking_spot; 
	
	@NotBlank
	private Date check_in;
	
	private Date check_out;
	
	private double price;
	
	public Booking() {}

	/**
	 * @return the id_vehicle
	 */
	public long getId_vehicle() {
		return id_vehicle;
	}

	/**
	 * @param id_vehicle the id_vehicle to set
	 */
	public void setId_vehicle(long id_vehicle) {
		this.id_vehicle = id_vehicle;
	}

	/**
	 * @return the id_parking_spot
	 */
	public long getId_parking_spot() {
		return id_parking_spot;
	}

	/**
	 * @param id_parking_spot the id_parking_spot to set
	 */
	public void setId_parking_spot(long id_parking_spot) {
		this.id_parking_spot = id_parking_spot;
	}

	/**
	 * @return the check_in
	 */
	public Date getCheck_in() {
		return check_in;
	}

	/**
	 * @param check_in the check_in to set
	 */
	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}

	/**
	 * @return the check_out
	 */
	public Date getCheck_out() {
		return check_out;
	}

	/**
	 * @param check_out the check_out to set
	 */
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
