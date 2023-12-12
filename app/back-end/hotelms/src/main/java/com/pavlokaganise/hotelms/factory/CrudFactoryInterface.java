package com.pavlokaganise.hotelms.factory;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.StaffEntity;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import com.pavlokaganise.hotelms.repositories.StaffRepository;

import java.time.LocalDate;

public interface CrudFactoryInterface {
    GuestEntity createGuestEntity();
    GuestEntity createGuestEntity(String firstName, String lastName, LocalDate dateOfBirth);
    StaffEntity createStaffEntity();
    StaffEntity createStaffEntity(String firstName, String lastName, String jobTitle);
//    Object createGuestController(GuestRepository guestRepository);
//    Object createStaffController(StaffRepository staffRepository);
}
