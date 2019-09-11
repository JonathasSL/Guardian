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

import com.guardian.guardianbackend.models.Vehicle;
import com.guardian.guardianbackend.repository.VehicleRepository;



@RestController
@RequestMapping("api/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleRepository _vehicleRepository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Vehicle> listVehicle(){
		Iterable<Vehicle> vehicles = _vehicleRepository.findAll();
		return vehicles;
	}
	
	@PostMapping()
	public Vehicle registerVehicle(@RequestBody @Valid Vehicle vehicle) {
		return _vehicleRepository.save(vehicle);
	}
	
	@DeleteMapping()
	public Vehicle deleteVehicle(@RequestBody Vehicle vehicle) {
		_vehicleRepository.delete(vehicle);
		return vehicle;
	}

}
