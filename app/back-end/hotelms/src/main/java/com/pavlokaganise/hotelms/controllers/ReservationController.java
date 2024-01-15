package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.ReservationEntity;
import com.pavlokaganise.hotelms.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public Iterable<ReservationEntity> findAllReservations() {
        return this.reservationRepository.findAll();
    }

    @PostMapping("/reservations")
    public ReservationEntity addOneReservation(@RequestBody ReservationEntity reservation) {
        return this.reservationRepository.save(reservation);
    }
}
