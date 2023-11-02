package com.pavlokaganise.hotelms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Guest controller example

//
//@RestController
//@RequestMapping("/guests")
//public class GuestController {
//
//    @Autowired
//    private GuestService guestService;
//
//    @GetMapping("/{id}")
//    public Guest getGuestById(@PathVariable Long id) {
//        return guestService.getGuestById(id);
//    }
//
//    @PostMapping
//    public Guest createGuest(@RequestBody Guest guest) {
//        return guestService.createGuest(guest);
//    }
//
//    @PutMapping("/{id}")
//    public Guest updateGuest(@PathVariable Long id, @RequestBody Guest guest) {
//        return guestService.updateGuest(id, guest);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteGuest(@PathVariable Long id) {
//        guestService.deleteGuest(id);
//    }
//}
