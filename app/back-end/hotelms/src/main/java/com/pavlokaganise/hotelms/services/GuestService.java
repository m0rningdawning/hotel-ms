package com.pavlokaganise.hotelms.services;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GuestService {
//    @Autowired
//    private GuestService instance;
    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private CrudFactory crudFactory;

//    public GuestService getInstance(){
//        return this.instance;
//    }

    public Iterable<GuestEntity> findAllGuests() {
        return guestRepository.findAll();
    }

    public GuestEntity addOneGuest(@RequestBody GuestEntity guest) {
        return guestRepository.save(guest);
    }

    public GuestEntity addOneGuestFactory(@RequestBody GuestEntity guest){
        return crudFactory.createGuestEntity(guest, this.guestRepository);
    }

    public GuestEntity findOneGuest(Integer id) {
        return guestRepository.findById(id).orElseThrow();
    }
}
