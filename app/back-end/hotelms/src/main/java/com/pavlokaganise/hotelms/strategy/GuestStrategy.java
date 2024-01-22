package com.pavlokaganise.hotelms.strategy;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

public interface GuestStrategy {
    ResponseEntity<?> execute(GuestEntity guest);
}

