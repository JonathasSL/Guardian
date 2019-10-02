package com.guardian.guardianbackend.controllers;

import java.util.Optional;

import com.guardian.guardianbackend.models.ParkingSpot;
import com.guardian.guardianbackend.repository.ParkingSpotRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/parking_spot")
public class ParkingSpotController {

    @Autowired
    private ParkingSpotRepository _ParkingSpotRepository;

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<ParkingSpot> findAll() {
        Iterable<ParkingSpot> spots = _ParkingSpotRepository.findAll();
        return spots;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingSpot> findById(@PathVariable long id) {
        Optional<ParkingSpot> oSpot = _ParkingSpotRepository.findById(id);
        if (!oSpot.isPresent())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(oSpot.get());
    }

    // @PostMapping()
    // @ResponseStatus(HttpStatus.CREATED)
    // public ParkingSpot register(@RequestBody long idParking, long ammount, int idVehicleType){
    //  // TODO: Discutir sobre como sera a criacao de spots
    //     return ;
    // }

    @PutMapping()
    public ResponseEntity<ParkingSpot> update(){
        //TODO: Discutir oque deve ser recebido para atualizacao, status only?
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping
    public ResponseEntity<ParkingSpot> delete(){
        //TODO: 
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

}