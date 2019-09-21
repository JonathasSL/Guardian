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

import com.guardian.guardianbackend.models.Driver;
import com.guardian.guardianbackend.repository.DriverRepository;

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

	@GetMapping("api/driver/{id}")
	public @ResponseBody Driver getById(long id) {
		Iterable<Driver> drivers = _driverRepository.findAll();
		Driver driverFound = new Driver();

		for (Driver driver : drivers) {
			if (driver.getID() == id) {
				driverFound = driver;
			}
		}

		return driverFound;
	}

	@PostMapping()
	public Driver registerDriver(@RequestBody @Valid Driver driver) {
		return _driverRepository.save(driver);
	}

	@DeleteMapping()
	public Driver deleteDriver(@RequestBody Driver driver) {
		_driverRepository.delete(driver);
		return driver;
	}

}
