package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.RoomEntity;
import com.pavlokaganise.hotelms.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    private final RoomRepository roomRepository;
    @Autowired
    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    @GetMapping("/rooms")
    public Iterable<RoomEntity> findAllRooms() {
        return this.roomRepository.findAll();
    }

    @PostMapping("/rooms")
    public RoomEntity addOneRoom(@RequestBody RoomEntity room) {
        return this.roomRepository.save(room);
    }
}