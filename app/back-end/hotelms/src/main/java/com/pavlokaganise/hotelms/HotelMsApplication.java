package com.pavlokaganise.hotelms;

//import com.pavlokaganise.hotelms.handlers.ErrorHandler;
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
    @Autowired
//    public ErrorHandler errorHandler;

    public static void main(String[] args) {
        SpringApplication.run(HotelMsApplication.class, args);
    }

    @GetMapping("/test")
    public String endpointRoot() {
        return "This is the root end point!";
    }
}
