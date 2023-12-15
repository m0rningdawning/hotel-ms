package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.ReservationEntity;
import com.pavlokaganise.hotelms.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationController {
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/reservations")
    public Iterable<ReservationEntity> findAllGuests() {
        return this.reservationRepository.findAll();
    }

    @PostMapping("/reservations")
    public ReservationEntity addOneGuest(@RequestBody ReservationEntity reservation) {
        return this.reservationRepository.save(reservation);
    }
}
