package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import com.pavlokaganise.hotelms.services.FrontDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontDeskController {
    @Autowired
    private FrontDeskService frontDeskService;

    @GetMapping("/staff/front-desk")
    public ResponseEntity<Iterable<FrontDeskEntity>> findAllFrontDesk() {
        return new ResponseEntity<>(frontDeskService.findAllFrontDesk(), HttpStatus.OK);
    }

    @GetMapping("/staff/front-desk/{id}")
    public ResponseEntity<FrontDeskEntity> findOneFrontGuest(@PathVariable Integer id) {
        return new ResponseEntity<>(frontDeskService.findOneFrontDesk(id), HttpStatus.OK);
    }

    @PostMapping("/staff/front-desk")
    public ResponseEntity<FrontDeskEntity> addOneFrontDesk(@RequestBody FrontDeskEntity frontDesk) {
        return new ResponseEntity<>(frontDeskService.addOneFrontDesk(frontDesk), HttpStatus.OK);
    }
}
