package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer> {
    List<ReservationEntity> findByEmail(String email);
    List<ReservationEntity> findByRoomNumberAndEmail(Integer roomNumber, String email);
}

