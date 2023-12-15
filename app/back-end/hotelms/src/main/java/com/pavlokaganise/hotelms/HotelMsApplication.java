package com.pavlokaganise.hotelms;

//import com.pavlokaganise.hotelms.handlers.ErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HotelMsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelMsApplication.class, args);
    }
}
