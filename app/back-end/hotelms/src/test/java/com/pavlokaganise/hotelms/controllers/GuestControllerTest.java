package com.pavlokaganise.hotelms.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pavlokaganise.hotelms.entities.GuestEntity;
import com.pavlokaganise.hotelms.services.GuestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.time.LocalDate;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@JsonTest
public class GuestControllerTest {
    private MockMvc mockMvc;

    @Mock
    private GuestService guestService;

    @InjectMocks
    private GuestController guestController;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(guestController).build();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Test
    public void testFindAllGuests() throws Exception {
        Iterable<GuestEntity> mockData =  Arrays.asList(
                new GuestEntity("John", "Doe", LocalDate.parse("1990-01-01")),
                new GuestEntity("Michael", "Doe", LocalDate.parse("1990-01-01")),
                new GuestEntity("Anne", "Doe", LocalDate.parse("1990-01-01"))
        );
        when(guestService.findAllGuests()).thenReturn(mockData);

        mockMvc.perform(get("/guests"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].firstName").value("John"))
                .andReturn();
        verify(guestService, times(1)).findAllGuests();
    }

    @Test
    public void testFindOneGuest() throws Exception {
        int guestId = 1;
        GuestEntity mockGuest = new GuestEntity("John", "Doe", LocalDate.parse("1990-01-01"));
        when(guestService.findOneGuest(guestId)).thenReturn(mockGuest);

        mockMvc.perform(get("/guests/{id}", guestId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.firstName").value("John"))
                .andReturn();
        verify(guestService, times(1)).findOneGuest(eq(guestId));
    }

    @Test
    public void testAddOneGuest() throws Exception {
        GuestEntity mockGuest = new GuestEntity("John", "Doe", LocalDate.parse("1990-01-01"));
        String requestBody = objectMapper.writeValueAsString(mockGuest);
        when(guestService.addOneGuest(any())).thenReturn(mockGuest);

        mockMvc.perform(post("/guests")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.firstName").value("John"))
                .andReturn();
        verify(guestService, times(1)).addOneGuest(any());
    }
}
