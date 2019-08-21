package com.guardian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {

}
