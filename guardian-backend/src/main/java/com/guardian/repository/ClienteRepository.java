package com.guardian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
