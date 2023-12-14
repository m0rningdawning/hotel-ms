package com.pavlokaganise.hotelms.config;

import com.pavlokaganise.hotelms.factory.CrudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CrudFactory CrudFactory(){
        return new CrudFactory();
    }
}
