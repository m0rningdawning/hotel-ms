package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer> {}
