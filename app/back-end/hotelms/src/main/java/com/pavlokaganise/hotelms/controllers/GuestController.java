package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuestController {
    private final GuestRepository guestRepository;

    @Autowired
    public GuestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping("/guests")
    public Iterable<GuestEntity> findAllGuests() {
        return this.guestRepository.findAll();
    }

    @PostMapping("/guests")
    public GuestEntity addOneGuest(@RequestBody GuestEntity guest) {
        return this.guestRepository.save(guest);
    }
}
