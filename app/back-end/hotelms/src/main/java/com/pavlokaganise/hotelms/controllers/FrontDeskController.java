package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import com.pavlokaganise.hotelms.repositories.FrontDeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontDeskController {
    private final FrontDeskRepository frontDeskRepository;
    @Autowired
    public FrontDeskController(FrontDeskRepository frontDeskRepository) {
        this.frontDeskRepository = frontDeskRepository;
    }
    @GetMapping("/staff")
    public Iterable<FrontDeskEntity> findAllStaff() {
        return this.frontDeskRepository.findAll();
    }

    @PostMapping("/staff")
    public FrontDeskEntity addOneStaff(@RequestBody FrontDeskEntity staff) {
        return this.frontDeskRepository.save(staff);
    }

}
