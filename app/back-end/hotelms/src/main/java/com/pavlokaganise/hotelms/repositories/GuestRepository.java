package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Integer> {
    Optional<GuestEntity> findByEmail(String email);
    Optional<GuestEntity> findByPassword(String password);
}
