package com.guardian.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotBlank
	private String Nome;

	@NotBlank
	private String CPF;
	
	@NotBlank
	private String Telefone;
	
	@NotBlank
	private ArrayList<Veiculos> Veiculos;

	
	public Cliente() {}
	
	public Cliente(long ID, String Nome, String CPF, String Telefone, 
				   ArrayList<Veiculos> Veiculos) {
		this.ID = ID;
		this.Nome = Nome;
		this.CPF = CPF;
		this.Telefone = Telefone;
		this.Veiculos = Veiculos;
	}
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public ArrayList<Veiculos> getVeiculos() {
		return Veiculos;
	}

	public void setVeiculos(ArrayList<Veiculos> veiculos) {
		Veiculos = veiculos;
	}
	

}
