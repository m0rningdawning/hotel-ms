package com.pavlokaganise.hotelms.factory;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.StaffEntity;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import com.pavlokaganise.hotelms.repositories.StaffRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

public interface CrudFactoryInterface {
    GuestEntity createGuestEntity();
    GuestEntity createGuestEntity(@RequestBody GuestEntity guest);
    StaffEntity createStaffEntity();
    StaffEntity createStaffEntity(String firstName, String lastName, String jobTitle);
}
