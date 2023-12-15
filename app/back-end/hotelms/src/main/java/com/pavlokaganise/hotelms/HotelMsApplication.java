package com.pavlokaganise.hotelms;

//import com.pavlokaganise.hotelms.handlers.ErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HotelMsApplication {
    //public ErrorHandler errorHandler;
    // TODO:
    //  1. Refactor factory to create controllers along/instead of entities
    //  2. Refactor methods of entities (Maybe?)

    public static void main(String[] args) {
        SpringApplication.run(HotelMsApplication.class, args);
    }
}
