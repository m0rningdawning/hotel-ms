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

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.pavlokaganise.hotelms")
public class HotelMsApplication {
    //public ErrorHandler errorHandler;
    CrudFactory crudFactory = new CrudFactory();
    GuestEntity guestEntity = crudFactory.createGuestEntity();
    StaffEntity staffEntity = crudFactory.createStaffEntity();

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
