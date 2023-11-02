package com.pavlokaganise.hotelms.handlers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandler implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        int statusCode = (int) request.getAttribute("javax.servlet.error.status_code");

        return switch (statusCode) {
            case 404 -> "404 - Not found!";
            case 500 -> "500 - Internal Server Error";
            default -> "An error occurred";
        };
    }
}
