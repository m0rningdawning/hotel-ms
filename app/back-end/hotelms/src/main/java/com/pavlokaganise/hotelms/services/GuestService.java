package com.pavlokaganise.hotelms.services;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

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

    public Optional<GuestEntity> findByEmail(String email) {
        return guestRepository.findByEmail(email);
    }

    public Optional<GuestEntity> findByPassword(String password) {
        return guestRepository.findByPassword(password);
    }

    public GuestEntity addOneGuest(@RequestBody GuestEntity guest) {
        return guestRepository.save(guest);
    }

    public boolean loginGuest(String email, String password) {
        Optional<GuestEntity> optionalGuest = guestRepository.findByEmail(email);

        if (optionalGuest.isPresent()) {
            GuestEntity guest = optionalGuest.get();
            return password.equals(guest.getPassword());
        }
        return false;
    }

    public GuestEntity registerGuest(@RequestBody GuestEntity guest) throws Exception {
        Optional<GuestEntity> og = guestRepository.findByEmail(guest.getEmail());

        if (og.isPresent())
            throw new Exception("The user is already registered!");

        return guestRepository.save(guest);
    }

    public GuestEntity addOneGuestFactory(@RequestBody GuestEntity guest) {
        return crudFactory.createGuestEntity(guest, this.guestRepository);
    }

    public GuestEntity findOneGuest(Integer id) {
        return guestRepository.findById(id).orElseThrow();
    }
}
