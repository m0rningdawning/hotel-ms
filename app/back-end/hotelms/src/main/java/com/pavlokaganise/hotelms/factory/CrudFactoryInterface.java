package com.pavlokaganise.hotelms.factory;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

public interface CrudFactoryInterface {
    GuestEntity createGuestEntity();
    GuestEntity createGuestEntity(@RequestBody GuestEntity guest, GuestRepository guestRepository);
    FrontDeskEntity createStaffEntity();
    FrontDeskEntity createStaffEntity(String firstName, String lastName, LocalDate dateOfBirth);
}
