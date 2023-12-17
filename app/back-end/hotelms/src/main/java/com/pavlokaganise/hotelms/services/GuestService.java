package com.pavlokaganise.hotelms.services;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GuestService {
    private final GuestRepository guestRepository;
    private final CrudFactory crudFactory;

    public GuestService(GuestRepository guestRepository, CrudFactory crudFactory) {
        this.guestRepository = guestRepository;
        this.crudFactory = crudFactory;
    }

    public Iterable<GuestEntity> findAllGuests() {
        return guestRepository.findAll();
    }

    public GuestEntity addOneGuest(@RequestBody GuestEntity guest) {
        return guestRepository.save(guest);
    }
}
