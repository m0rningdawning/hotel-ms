package com.pavlokaganise.hotelms.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer roomNumber;
    private String roomType;
    private Boolean isAvailable;

    public RoomEntity() {
    }

    public RoomEntity(Integer roomNumber, String roomType, Boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }
}
