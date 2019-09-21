package com.guardian.guardianbackend.controllers;

import javax.validation.Valid;

import com.guardian.guardianbackend.models.Booking;
import com.guardian.guardianbackend.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class BookingController{

    @Autowired
    private BookingRepository _bookingRepository;

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Booking> RetreiveBookings(){
        Iterable<Booking> bookings = _bookingRepository.findAll();
        return bookings;
    }

    @PostMapping()
    public Booking registerBooking(@RequestBody @Valid Booking booking){
        return _bookingRepository.save(booking);
    }

    @DeleteMapping()
    public Booking deleteBooking(@RequestBody Booking booking){
        _bookingRepository.delete(booking);
        return booking;
    }
}