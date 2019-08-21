package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
