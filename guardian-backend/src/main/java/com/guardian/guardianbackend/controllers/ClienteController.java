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

import com.guardian.guardianbackend.repository.ClienteRepository;
import com.guardian.guardianbackend.models.Cliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository _clienteRepository;

	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Cliente> ListaClientes() {
		Iterable<Cliente> clientes = _clienteRepository.findAll();
		return clientes;
	}
	
	@PostMapping()
	public Cliente CadastraCliente(@RequestBody @Valid Cliente cliente) {
		 return _clienteRepository.save(cliente);
	}
	
	@DeleteMapping()
	public Cliente DeletaCliente(@RequestBody Cliente cliente) {
		 _clienteRepository.delete(cliente);
		 return cliente;
	}
	
	
	
	
	
}
