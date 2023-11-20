package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Integer> { }