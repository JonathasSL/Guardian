package com.guardian.guardianbackend.controllers;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.guardian.guardianbackend.models.Driver;
import com.guardian.guardianbackend.repository.DriverRepository;

@CrossOrigin
@RestController
@RequestMapping("api/driver")
public class DriverController {

	@Autowired
	private DriverRepository _driverRepository;

	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Driver> listDriver() {
		Iterable<Driver> drivers = _driverRepository.findAll();
		return drivers;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Driver> retriveById(@PathVariable long id) {
		Optional<Driver> oDriver = _driverRepository.findById(id);
		if (oDriver.isEmpty())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(oDriver.get());
	}

	@PostMapping()
	public Driver registerDriver(@Valid @RequestBody Driver driver) {
		Optional<Driver> oDriver= _driverRepository.findById(driver.getID());
		if(oDriver.isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"This driver already exists");
		return _driverRepository.save(driver);
	}
	
	@PutMapping()
	public ResponseEntity<Driver> updateParking(@RequestBody Driver newDriver) {
		Optional<Driver> oParking = _driverRepository.findById(newDriver.getID());
		if (oParking.isPresent())
			_driverRepository.deleteById(newDriver.getID());
		else
			return ResponseEntity.notFound().build();
		return ResponseEntity.accepted().body(registerDriver(newDriver));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Driver> deleteDriver(@PathVariable long id) {
		Optional<Driver> oDriver = _driverRepository.findById(id);
		if (oDriver.isPresent())
			_driverRepository.deleteById(id);
		else
			return ResponseEntity.notFound().build();
		return ResponseEntity.accepted().body(oDriver.get());
	}

}
