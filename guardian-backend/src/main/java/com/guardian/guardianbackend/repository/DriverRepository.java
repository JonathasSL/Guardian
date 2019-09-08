package com.guardian.guardianbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guardian.guardianbackend.models.Driver;

public interface DriverRepository extends JpaRepository<Driver, String> {

}
