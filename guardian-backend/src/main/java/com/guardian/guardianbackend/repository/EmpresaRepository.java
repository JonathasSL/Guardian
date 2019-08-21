package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {

}
