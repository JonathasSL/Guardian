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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.guardian.guardianbackend.models.Parking;
import com.guardian.guardianbackend.repository.ParkingRepository;

@CrossOrigin
@RestController
@RequestMapping("api/parking")
public class ParkingController {

	@Autowired
	private ParkingRepository _parkingRepository;

	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Parking> findAll() {
		Iterable<Parking> parkings = _parkingRepository.findAll();
		return parkings;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Parking> findById(@PathVariable long id) {
		Optional<Parking> oParking = _parkingRepository.findById(id);
		if (!oParking.isPresent())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(oParking.get());
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Parking register(@RequestBody @Valid Parking parking) {
		Optional<Parking> oParking = _parkingRepository.findByEmail(parking.getEmail());
		if (oParking.isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "This Parking already exists");
		return _parkingRepository.save(parking);
	}

	@PutMapping()
	public ResponseEntity<Parking> update(@RequestBody Parking newParking) {
		Optional<Parking> oParking = _parkingRepository.findById(newParking.getID());
		if (oParking.isPresent())
			_parkingRepository.deleteById(newParking.getID());
		else
			return ResponseEntity.notFound().build();
		return ResponseEntity.accepted().body(register(newParking));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Parking> delete(@PathVariable long id) {
		Optional<Parking> oParking = _parkingRepository.findById(id);
		if (oParking.isPresent())
			_parkingRepository.deleteById(id);
		else
			return ResponseEntity.notFound().build();
		return ResponseEntity.accepted().body(oParking.get());
	}

	@PostMapping("/login")
	public ResponseEntity<Parking> login(@RequestBody ObjectNode login) {
		String email = login.get("email").asText();
		String password = login.get("password").asText();
		Optional<Parking> oParking = _parkingRepository.findByEmail(email);
		if (oParking.isPresent()) {
			if (oParking.get().getPassword().equals(password)) {
				return ResponseEntity.accepted().body(oParking.get());
			} else {
				return ResponseEntity.status(401).build();
			}
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
