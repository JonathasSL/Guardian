package com.guardian.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Veiculos {
	
	//TODO - Adicionar tipo, e outros atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotBlank
	private String Placa;
	
	
	public Veiculos() {
		
	}

	public Veiculos(long ID, String Placa) {
		this.ID = ID;
		this.Placa = Placa;
	}


	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}
	
}
