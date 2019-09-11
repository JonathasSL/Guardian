package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Parking;

public interface ParkingRepository extends JpaRepository<Parking, String> {

}
