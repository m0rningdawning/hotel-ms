package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping("/guests")
    public ResponseEntity<Iterable<GuestEntity>> findAllGuests() {
        return new ResponseEntity<>(guestService.findAllGuests(), HttpStatus.OK);
    }

    @GetMapping("/guests/{id}")
    public ResponseEntity<GuestEntity> findOneGuest(@PathVariable Integer id) {
        return new ResponseEntity<>(guestService.findOneGuest(id), HttpStatus.OK);
    }

    @PostMapping("/guests")
    public ResponseEntity<GuestEntity> addOneGuest(@RequestBody GuestEntity guest) {
        return new ResponseEntity<>(guestService.addOneGuest(guest), HttpStatus.CREATED);
    }
}
