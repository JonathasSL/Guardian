package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String>  {

}
