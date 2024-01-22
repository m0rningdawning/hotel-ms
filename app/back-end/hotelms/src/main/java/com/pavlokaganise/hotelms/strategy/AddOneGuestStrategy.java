package com.pavlokaganise.hotelms.strategy;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component("addOneGuestStrategy")
public class AddOneGuestStrategy implements GuestStrategy {
    @Autowired
    private GuestService guestService;

    @Override
    public ResponseEntity<?> execute(GuestEntity guest) {
        return new ResponseEntity<>(guestService.addOneGuest(guest), HttpStatus.CREATED);
    }
}
