package com.guardian.guardianbackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotNull
	private long IDCliente;
	
	@NotNull
	private long IDEmpresa;

	@NotBlank
	private String placa;
	
	@NotNull
	@Range(min = 1, max = 2)
	private Integer tipoVeiculo; //Moto - 1, Carro - 2
	
	@NotBlank
	private String modelo;
	
	public Veiculo() {}

	public Veiculo(long ID, String Placa, long iDCliente, long iDEmpresa) {
		setID(ID);
		setPlaca(placa);
		setIDCliente(iDCliente);
		setIDEmpresa(iDEmpresa);
		
	}
	
	/* -- GETTERS & SETTERS -- */
	
	public long getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(long iDCliente) {
		this.IDCliente = iDCliente;
	}

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
	
	public long getIDEmpresa() {
		return IDEmpresa;
	}

	public void setIDEmpresa(long iDEmpresa) {
		IDEmpresa = iDEmpresa;
	}

	
}
