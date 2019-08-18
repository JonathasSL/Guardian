package com.guardian.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Empresa {
	// Empresa/Estacionamento
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String CNPJ;
	
	@NotBlank
	private long totalVagas;
	
	@NotBlank 
	private long longitude;
	@NotBlank
	private long latidude;
	
	private long vagasLivres;
	
	private ArrayList<Veiculo> estacionamento;
	//TODO - Escolher estrutura de dados para a tabela de preços

	public Empresa() {
		setEstacionamento(new ArrayList<>());
	}

	/**
	 * @param iD
	 * @param nome
	 * @param CNPJ
	 * @param totalVagas
	 * @param vagasLivres
	 */
	public Empresa(long iD, @NotBlank String nome, @NotBlank String CNPJ, @NotBlank long totalVagas, long vagasLivres) {
		setID(ID);
		setNome(nome);
		setCNPJ(CNPJ);
		setTotalVagas(totalVagas);
		setVagasLivres(vagasLivres);
		setEstacionamento(new ArrayList<>());
	}
	

	/* -- GETTERS & SETTERS -- */
	
	/**
	 * @return the iD
	 */
	public long getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(long iD) {
		ID = iD;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cNPJ
	 */
	public String getCNPJ() {
		return CNPJ;
	}
	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	/**
	 * @return the totalVagas
	 */
	public long getTotalVagas() {
		return totalVagas;
	}
	/**
	 * @param totalVagas the totalVagas to set
	 */
	public void setTotalVagas(long totalVagas) {
		this.totalVagas = totalVagas;
	}

	/**
	 * @return the vagasLivres
	 */
	public long getVagasLivres() {
		return vagasLivres;
	}
	/**
	 * @param vagasLivres the vagasLivres to set
	 */
	public void setVagasLivres(long vagasLivres) {
		this.vagasLivres = vagasLivres;
	}

	
	/**
	 * @return the estacionamento
	 */
	public ArrayList<Veiculo> getEstacionamento() {
		return estacionamento;
	}

	/**
	 * @param estacionamento the estacionamento to set
	 */
	public void setEstacionamento(ArrayList<Veiculo> estacionamento) {
		this.estacionamento = estacionamento;
	}
}
