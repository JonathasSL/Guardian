package com.guardian.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Veiculo {
	
	//TODO - Adicionar tipo, e outros atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotBlank
	private String placa;
	
	@NotBlank
	private String tipoVeiculo; //Moto, Carro
	
	@NotBlank
	private String modelo; //Gol, palio, fusca
	
	public Veiculo() {}

	public Veiculo(long ID, String Placa) {
		setID(ID);
		setPlaca(placa);
	}
	
	/* -- GETTERS & SETTERS -- */

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
