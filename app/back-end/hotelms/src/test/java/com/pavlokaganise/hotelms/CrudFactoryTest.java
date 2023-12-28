package com.pavlokaganise.hotelms;

import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CrudFactoryTest {
    @Mock
    private GuestRepository guestRepository;

    @InjectMocks
    private CrudFactory crudFactory;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCreateGuestEntity() {
        GuestEntity guestEntity = crudFactory.createGuestEntity();
        assertEquals(GuestEntity.class, guestEntity.getClass());
    }

    @Test
    void testCreateGuestEntityWithRepo() {
        GuestEntity guest = new GuestEntity();
        when(guestRepository.save(guest)).thenReturn(guest);

        GuestEntity createdGuest = crudFactory.createGuestEntity(guest, guestRepository);

        verify(guestRepository, times(1)).save(guest);
        assertEquals(guest, createdGuest);
    }

    @Test
    void testCreateStaffEntity() {
        FrontDeskEntity frontDeskEntity = crudFactory.createStaffEntity();
        assertEquals(FrontDeskEntity.class, frontDeskEntity.getClass());
    }

    @Test
    void testCreateStaffEntityWithParams() {
        String firstName = "Staff";
        String lastName = "Member";
        LocalDate dateOfBirth = LocalDate.of(1990, 1, 1);

        FrontDeskEntity frontDeskEntity = crudFactory.createStaffEntity(firstName, lastName, dateOfBirth);

        assertEquals(firstName, frontDeskEntity.getFirstName());
        assertEquals(lastName, frontDeskEntity.getLastName());
        assertEquals(dateOfBirth, frontDeskEntity.getDateOfBirth());
    }
}
