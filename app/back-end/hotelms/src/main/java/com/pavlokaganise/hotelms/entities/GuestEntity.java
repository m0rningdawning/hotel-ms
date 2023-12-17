package com.pavlokaganise.hotelms.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Entity
@Table(name = "guests")
public class GuestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    @NonNull
    private LocalDate dateOfBirth;

    public int generateId() {
        long timestamp = System.currentTimeMillis();
        int randomNumber = (int) (Math.random() * 1000);
        return (int) (timestamp + randomNumber);
    }

    public GuestEntity() {
    }

    public GuestEntity(String firstName, String lastName, LocalDate dateOfBirth) {
        this.id = generateId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public GuestEntity(GuestEntity guest) {
        this.id = generateId();
        this.firstName = guest.getFirstName();
        this.lastName = guest.getLastName();
        this.dateOfBirth = guest.getDateOfBirth();
    }
}
