package com.pavlokaganise.hotelms.entities;

import jakarta.persistence.*;

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

    public Integer getId() {
        return this.id;
    }

    public Integer getRoomNumber() {
        return this.roomNumber;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public Boolean getIsAvailable() {
        return this.isAvailable;
    }
}
