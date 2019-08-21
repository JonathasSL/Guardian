package com.guardian.guardianbackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

	@NotNull
	private long totalVagas;

	@NotNull
	private long longitude;

	@NotNull
	private long latitude;

	@NotNull
	private long vagasLivres;

	public Empresa() {
	}

	/**
	 * @param iD
	 * @param nome
	 * @param CNPJ
	 * @param totalVagas
	 * @param vagasLivres
	 */
	public Empresa(long iD, String nome, String CNPJ, long totalVagas, long vagasLivres, long latitude, long longitude) {
		setID(ID);
		setNome(nome);
		setCNPJ(CNPJ);
		setTotalVagas(totalVagas);
		setVagasLivres(vagasLivres);
		setLatitude(latitude);
		setLongitude(longitude);
	}

	/* -- GETTERS & SETTERS -- */

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

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

}
