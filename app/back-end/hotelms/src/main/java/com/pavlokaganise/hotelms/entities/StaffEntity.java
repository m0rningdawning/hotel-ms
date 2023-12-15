package com.pavlokaganise.hotelms.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "staff")
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String jobTitle;

    public StaffEntity() {
    }

    public StaffEntity(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }
}
