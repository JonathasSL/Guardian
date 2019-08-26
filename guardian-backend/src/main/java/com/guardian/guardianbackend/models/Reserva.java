package com.guardian	.guardianbackend.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Reserva {
	
	@Id
	@NotBlank
	private String placa;
	
	@NotNull
	@Range(min = 1, max = 2)
	private Integer tipoVeiculo; //Moto - 1, Carro - 2
	
	@NotBlank
	private String modelo;
	
	
	public Reserva() {}
	
	public Reserva(String placa, Integer tipoVeiculo, String modelo) {
		setPlaca(placa);
		setTipoVeiculo(tipoVeiculo);
		setModelo(modelo);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(Integer tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
