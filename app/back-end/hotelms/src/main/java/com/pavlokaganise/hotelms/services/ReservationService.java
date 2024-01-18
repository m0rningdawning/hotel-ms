package com.pavlokaganise.hotelms.services;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.entities.ReservationEntity;
import com.pavlokaganise.hotelms.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<ReservationEntity> findByEmail(@RequestBody ReservationEntity reservation) {
        return reservationRepository.findByEmail(reservation.getEmail());
    }

    private List<ReservationEntity> findByRoomNumberAndEmail(Integer roomNumber, String email) {
        return reservationRepository.findByRoomNumberAndEmail(roomNumber, email);
    }

    public ReservationEntity addOneReservation(@RequestBody ReservationEntity reservation) throws Exception {
//        List<ReservationEntity> or = findByEmail(reservation);
//
//        if (or.isPresent())
//            throw new Exception("Already reserved!");

        return reservationRepository.save(reservation);
    }

    public HttpStatus removeOneReservation(ReservationEntity reservation) {
        List<ReservationEntity> reservations = findByRoomNumberAndEmail(
                reservation.getRoomNumber(), reservation.getEmail()
        );

        if (!reservations.isEmpty()) {
            reservationRepository.deleteAll(reservations);
            return HttpStatus.OK;
        } else {
            return HttpStatus.UNAUTHORIZED;
        }
    }

    public List<ReservationEntity> findAllReservations() {
        return reservationRepository.findAll();
    }
}
