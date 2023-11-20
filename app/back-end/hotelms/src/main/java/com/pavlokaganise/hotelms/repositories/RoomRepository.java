package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Integer> { }