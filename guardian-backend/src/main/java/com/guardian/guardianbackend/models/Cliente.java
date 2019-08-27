package com.guardian.guardianbackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotBlank
	private String nome;

	@NotBlank
	private String CPF;
	
	@NotBlank
	private String telefone;
	
	public Cliente() {
	}
	
	public Cliente(long ID, String nome, String CPF, String telefone) {
		setID(ID);
		setNome(nome);
		setCPF(CPF);
		setTelefone(telefone);
	}
	
	/* -- GETTERS & SETTERS -- */
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		this.ID = iD;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
