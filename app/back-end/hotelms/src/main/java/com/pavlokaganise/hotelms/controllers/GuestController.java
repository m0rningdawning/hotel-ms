package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.controllers.requests.LoginRequest;
import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/guests/{email}")
    public ResponseEntity<Optional<GuestEntity>> findOneGuestEmail(@PathVariable String email){
        return new ResponseEntity<>(guestService.findByEmail(email), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        boolean loginSuccessful = guestService.loginGuest(email, password);

        if (loginSuccessful) {
            return new ResponseEntity<>("Login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Login failed", HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/guests")
    public ResponseEntity<GuestEntity> addOneGuest(@RequestBody GuestEntity guest) {
        return new ResponseEntity<>(guestService.addOneGuest(guest), HttpStatus.CREATED);
    }

    @PostMapping("/guests-factory")
    public ResponseEntity<GuestEntity> addOneGuestFactory(@RequestBody GuestEntity guest){
        return new ResponseEntity<>(guestService.addOneGuestFactory(guest), HttpStatus.CREATED);
    }

    @PostMapping("/register")
    public ResponseEntity<GuestEntity> registerGuest(@RequestBody GuestEntity guest) throws Exception {
        return new ResponseEntity<>(guestService.registerGuest(guest), HttpStatus.CREATED);
    }
}
