package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.ReservationEntity;
import com.pavlokaganise.hotelms.repositories.ReservationRepository;
import com.pavlokaganise.hotelms.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public Iterable<ReservationEntity> findAllReservations() {
        return reservationService.findAllReservations();
    }

    @PostMapping("/reservations/add")
    public ResponseEntity<ReservationEntity> addOneReservation(@RequestBody ReservationEntity reservation) throws Exception {
        return new ResponseEntity<>(reservationService.addOneReservation(reservation), HttpStatus.OK);
    }

    @PostMapping("/reservations/remove")
    public ResponseEntity<HttpStatus> removeOneReservation(@RequestBody ReservationEntity reservation) {
        return new ResponseEntity<>(reservationService.removeOneReservation(reservation));
    }

    @PostMapping("/reservations/find")
    public ResponseEntity<List<ReservationEntity>> findReservationsEmail(@RequestBody ReservationEntity reservation) {
        return new ResponseEntity<>(reservationService.findByEmail(reservation), HttpStatus.OK);
    }

}
