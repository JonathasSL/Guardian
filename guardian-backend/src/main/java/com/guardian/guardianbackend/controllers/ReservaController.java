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

import com.guardian.guardianbackend.models.Reserva;
import com.guardian.guardianbackend.repository.ReservaRepository;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

	@Autowired
	private ReservaRepository _reservaRepository;

	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Reserva> ListaEmpresas() {
		Iterable<Reserva> reservas = _reservaRepository.findAll();
		return reservas;
	}

	@PostMapping()
	public Reserva CadastraReserva(@RequestBody @Valid Reserva reserva) {
		return _reservaRepository.save(reserva);
	}

	@DeleteMapping()
	public Reserva DeletaReserva(@RequestBody Reserva reserva) {
		_reservaRepository.delete(reserva);
		return reserva;
	}

}
