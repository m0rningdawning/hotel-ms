package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.StaffEntity;
import com.pavlokaganise.hotelms.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StaffController {
    private final StaffRepository staffRepository;
    @Autowired
    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    @GetMapping("/staff")
    public Iterable<StaffEntity> findAllStaff() {
        return this.staffRepository.findAll();
    }

    @PostMapping("/staff")
    public StaffEntity addOneStaff(@RequestBody StaffEntity staff) {
        return this.staffRepository.save(staff);
    }

}
