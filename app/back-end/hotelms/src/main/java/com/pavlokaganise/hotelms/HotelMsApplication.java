package com.pavlokaganise.hotelms;

//import com.pavlokaganise.hotelms.handlers.ErrorHandler;
import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.StaffEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.pavlokaganise.hotelms")
public class HotelMsApplication {
    //public ErrorHandler errorHandler;
    // TODO:
    //  1. Refactor factory to create controllers along/instead of entities
    //  2. Refactor methods of entities (Maybe?)
    CrudFactory crudFactory;
    GuestEntity guestEntity = crudFactory.createGuestEntity("1", "Someone", LocalDate.parse("2022-02-17"));
    StaffEntity staffEntity = crudFactory.createStaffEntity("1", "Pavlo", "Manager");

    public static void main(String[] args) {
        SpringApplication.run(HotelMsApplication.class, args);
    }

    @GetMapping("/test")
    public String endpointRoot() {
        return "This is the root end point!";
    }

    @GetMapping("/factory")
    public String endpointFactory() {
        int guestId = guestEntity.getId();
        int staffId = staffEntity.getId();
        return "Guest ID: " + guestId + "\nStaff ID: " + staffId;
    }
}
