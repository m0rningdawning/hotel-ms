package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.RoomEntity;
import com.pavlokaganise.hotelms.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/rooms")
    public Iterable<RoomEntity> findAllRooms() {
        return this.roomRepository.findAll();
    }

    @PostMapping("/rooms")
    public RoomEntity addOneRoom(@RequestBody RoomEntity room) {
        return this.roomRepository.save(room);
    }
}