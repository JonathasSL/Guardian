package com.guardian.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guardian.models.Empresa;
import com.guardian.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository _empresaRepository;

	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Empresa> ListaEmpresas() {
		Iterable<Empresa> clientes = _empresaRepository.findAll();
		return clientes;
	}
	
	@PostMapping()
	public Empresa CadastraEmpresa(@RequestBody @Valid Empresa empresa) {
		 return _empresaRepository.save(empresa);
	}
	
	@DeleteMapping()
	public Empresa DeletaEmpresa(@RequestBody Empresa empresa) {
		_empresaRepository.delete(empresa);
		 return empresa;
	}
}
