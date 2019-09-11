package com.guardian.guardianbackend.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guardian.guardianbackend.models.Parking;
import com.guardian.guardianbackend.repository.ParkingRepository;

@RestController
@RequestMapping("api/parking")
public class ParkingController {
	
	@Autowired
	private ParkingRepository _parkingRepository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Parking> listParking(){
		Iterable<Parking> parkings = _parkingRepository.findAll();
		return parkings;
	}
	
	@PostMapping()
	public Parking registerParking(@RequestBody @Valid Parking parking) {
		return _parkingRepository.save(parking);
	}
	
	@DeleteMapping()
	public Parking deleteParking(@RequestBody Parking parking) {
		_parkingRepository.delete(parking);
		return parking;
	}
	
}
