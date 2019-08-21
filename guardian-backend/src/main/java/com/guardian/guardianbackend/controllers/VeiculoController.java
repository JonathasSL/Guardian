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

import com.guardian.guardianbackend.models.Veiculo;
import com.guardian.guardianbackend.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoRepository _veiculoRepository;

	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Veiculo> ListaVeiculos() {
		Iterable<Veiculo> veiculos = _veiculoRepository.findAll();
		return veiculos;
	}
	
	@PostMapping()
	public Veiculo CadastraVeiculo(@RequestBody @Valid Veiculo veiculo) {
		 return _veiculoRepository.save(veiculo);
	}
	
	@DeleteMapping()
	public Veiculo DeletaVeiculo(@RequestBody Veiculo veiculo) {
		_veiculoRepository.delete(veiculo);
		 return veiculo;
	}
	
}
