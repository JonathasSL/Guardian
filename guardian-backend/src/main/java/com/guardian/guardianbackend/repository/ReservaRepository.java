package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

}
