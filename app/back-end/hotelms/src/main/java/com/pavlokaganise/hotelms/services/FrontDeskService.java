package com.pavlokaganise.hotelms.services;

import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.FrontDeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FrontDeskService {
    @Autowired
    private FrontDeskRepository frontDeskRepository;
    @Autowired
    private CrudFactory crudFactory;

    public Iterable<FrontDeskEntity> findAllFrontDesk() {
        return frontDeskRepository.findAll();
    }

    public FrontDeskEntity addOneFrontDesk(@RequestBody FrontDeskEntity frontDesk) {
        return frontDeskRepository.save(frontDesk);
    }

    public FrontDeskEntity findOneFrontDesk(Integer id) {
        return frontDeskRepository.findById(id).orElseThrow();
    }
}
