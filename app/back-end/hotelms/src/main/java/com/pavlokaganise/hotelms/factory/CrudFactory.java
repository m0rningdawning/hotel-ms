package com.pavlokaganise.hotelms.factory;

import com.pavlokaganise.hotelms.controllers.GuestController;
import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.StaffEntity;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
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
    public StaffEntity createStaffEntity() {
        return new StaffEntity();
    }

    @Override
    public StaffEntity createStaffEntity(String firstName, String lastName, String jobTitle) {
        return new StaffEntity(firstName, lastName, jobTitle);
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
