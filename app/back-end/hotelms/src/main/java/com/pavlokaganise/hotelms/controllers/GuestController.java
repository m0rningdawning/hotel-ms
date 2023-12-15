package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.StaffEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {
    private final GuestRepository guestRepository;
    private final CrudFactory crudFactory;

    @Autowired
    public GuestController(GuestRepository guestRepository, CrudFactory crudFactory) {
        this.guestRepository = guestRepository;
        this.crudFactory = crudFactory;
    }

    @GetMapping("/guests")
    public Iterable<GuestEntity> findAllGuests() {
        return this.guestRepository.findAll();
    }

    @PostMapping("/guests")
    public GuestEntity addOneGuest(@RequestBody GuestEntity guest) {
        return this.guestRepository.save(guest);
        //return this.crudFactory.createGuestEntity(guest);
    }
}
