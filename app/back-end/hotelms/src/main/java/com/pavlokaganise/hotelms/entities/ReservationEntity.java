package com.pavlokaganise.hotelms.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "reservations")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer roomNumber;
    private String roomType;
    private LocalDate dateOfReservation;

    public ReservationEntity() {
    }

    public ReservationEntity(String firstName, String lastName, Integer roomNumber, String roomType, LocalDate dateOfReservation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dateOfReservation = dateOfReservation;
    }
}
