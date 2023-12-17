package com.pavlokaganise.hotelms.services;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.factory.CrudFactory;
import com.pavlokaganise.hotelms.repositories.GuestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class GuestServiceTest {
    @Mock
    private GuestRepository guestRepository;

    @Mock
    private CrudFactory crudFactory;

    @InjectMocks
    private GuestService guestService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindAllGuests() {
        List<GuestEntity> mockData =  Arrays.asList(
                new GuestEntity("John", "Doe", LocalDate.parse("1990-01-01")),
                new GuestEntity("Michael", "Doe", LocalDate.parse("1990-01-01")),
                new GuestEntity("Anne", "Doe", LocalDate.parse("1990-01-01"))
        );
        when(guestRepository.findAll()).thenReturn(mockData);

        Iterable<GuestEntity> result = guestService.findAllGuests();
        assertEquals(mockData, result);
        verify(guestRepository, times(1)).findAll();
    }

    @Test
    public void testAddOneGuest() {
        GuestEntity mockGuest = new GuestEntity("John", "Doe", LocalDate.parse("1990-01-01"));
        when(guestRepository.save(any())).thenReturn(mockGuest);

        GuestEntity result = guestService.addOneGuest(mockGuest);
        assertEquals(mockGuest, result);
        verify(guestRepository, times(1)).save(eq(mockGuest));
    }

    @Test
    public void testFindOneGuest() {
        int guestId = 2;
        GuestEntity mockGuest = new GuestEntity("John", "Doe", LocalDate.parse("1990-01-01"));
        when(guestRepository.findById(guestId)).thenReturn(Optional.of(mockGuest));

        GuestEntity result = guestService.findOneGuest(guestId);
        assertEquals(mockGuest, result);
        verify(guestRepository, times(1)).findById(eq(guestId));
    }

    @Test
    public void testFindOneGuestNotFound() {
        int guestId = 1;
        when(guestRepository.findById(guestId)).thenReturn(Optional.empty());
        assertThrows(Exception.class, () -> guestService.findOneGuest(guestId));
        verify(guestRepository, times(1)).findById(eq(guestId));
    }
}
