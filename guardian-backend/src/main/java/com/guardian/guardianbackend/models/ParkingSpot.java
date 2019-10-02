package com.guardian.guardianbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Parking_Spot")
    public long id;

    @Column(name = "id_Parking")
    public long idParking;

    @Column(name = "id_Vehicle_Type")
    public long idVehicleType;

    @Column(name = "id_status")
    public long idStatus;

    public ParkingSpot () {}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdParking() {
        return this.idParking;
    }

    public void setIdParking(long idParking) {
        this.idParking = idParking;
    }

    public long getIdVehicleType() {
        return this.idVehicleType;
    }

    public void setIdVehicleType(long idVehicleType) {
        this.idVehicleType = idVehicleType;
    }

    public long getIdStatus() {
        return this.idStatus;
    }

    public void setIdStatus(long idStatus) {
        this.idStatus = idStatus;
    }


    
}