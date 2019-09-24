package com.guardian.guardianbackend.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.guardian.guardianbackend.models.Vehicle;
import com.guardian.guardianbackend.repository.VehicleRepository;

@CrossOrigin
@RestController
@RequestMapping("api/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleRepository _vehicles;
	
	@GetMapping(produces="application/json")
	public List<Vehicle>  retrieveVehicles(){
		 return _vehicles.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vehicle> retrieveById(@PathVariable long id){
		Optional<Vehicle> oVehicle = _vehicles.findById(id);
		if(!oVehicle.isPresent())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(oVehicle.get());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle registerVehicle(@Valid @RequestBody Vehicle vehicle) {
		Optional<Vehicle> oVehicle = _vehicles.findByPlate(vehicle.getPlate());
		if(oVehicle.isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"A Vehicle with this plate already exists");
		return _vehicles.save(vehicle);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Vehicle> updateById(@PathVariable long id, @RequestBody Vehicle vehicle){
		Optional<Vehicle> oVehicle = _vehicles.findById(id);
		if(oVehicle.isPresent())
			_vehicles.deleteById(id);
		else
			return ResponseEntity.notFound().build();
		return ResponseEntity.accepted().body(registerVehicle(vehicle));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Vehicle> deleteVehicle(@PathVariable long id) {
		Optional<Vehicle> oVehicle = _vehicles.findById(id);
		if(oVehicle.isPresent())
			_vehicles.deleteById(id);
		else
			return ResponseEntity.notFound().build();
		return ResponseEntity.accepted().body(oVehicle.get());
	}
}
