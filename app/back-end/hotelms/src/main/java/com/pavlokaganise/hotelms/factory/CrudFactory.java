package com.pavlokaganise.hotelms.factory;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

@Component
public class CrudFactory implements CrudFactoryInterface{

    @Override
    public GuestEntity createGuestEntity() {
        return new GuestEntity();
    }

    @Override
    public GuestEntity createGuestEntity(@RequestBody GuestEntity guest) {
        return new GuestEntity(guest);
    }

    @Override
    public FrontDeskEntity createStaffEntity() {
        return new FrontDeskEntity();
    }

    @Override
    public FrontDeskEntity createStaffEntity(String firstName, String lastName, LocalDate dateOfBirth) {
        return new FrontDeskEntity(firstName, lastName, dateOfBirth);
    }

//    @Override
//    public Object createGuestController() {
//        return new GuestController(GuestRepository guestRepository);
//    }
//
//    @Override
//    public Object createStaffController() {
//        return null;
//    }
}
