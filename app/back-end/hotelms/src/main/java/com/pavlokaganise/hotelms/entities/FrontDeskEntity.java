package com.pavlokaganise.hotelms.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "front_desk")
public class FrontDeskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    @NonNull
    private LocalDate dateOfBirth;

    public FrontDeskEntity() {
    }

    public FrontDeskEntity(String firstName, String lastName, @NotNull LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public FrontDeskEntity(FrontDeskEntity frontDesk) {
        this.firstName = frontDesk.getFirstName();
        this.lastName = frontDesk.getLastName();
        this.dateOfBirth = frontDesk.getDateOfBirth();
    }
}
