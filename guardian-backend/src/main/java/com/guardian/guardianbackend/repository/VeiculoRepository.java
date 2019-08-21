package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
	

}
