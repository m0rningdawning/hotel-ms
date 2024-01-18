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
    private Integer roomNumber;
    private String email;
    private LocalDate dateOfReservation;

    public ReservationEntity() {
    }

    public ReservationEntity( Integer roomNumber, String email, LocalDate dateOfReservation) {
        this.roomNumber = roomNumber;
        this.email = email;
        this.dateOfReservation = dateOfReservation;
    }
}
