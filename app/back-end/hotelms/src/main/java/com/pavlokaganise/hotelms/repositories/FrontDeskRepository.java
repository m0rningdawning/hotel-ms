package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrontDeskRepository extends JpaRepository<FrontDeskEntity, Integer> { }