package com.guardian.guardianbackend.repository;

import com.guardian.guardianbackend.models.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,String>{}