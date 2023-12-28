package com.pavlokaganise.hotelms.controllers;

import com.pavlokaganise.hotelms.entities.FrontDeskEntity;
import com.pavlokaganise.hotelms.repositories.FrontDeskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FrontDeskControllerTest {
    private MockMvc mockMvc;

    @Mock
    private FrontDeskRepository frontDeskRepository;

    @InjectMocks
    private FrontDeskController frontDeskController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(frontDeskController).build();
    }

    @Test
    public void testFindAllFrontDesk() throws Exception {
        List<FrontDeskEntity> mockData = Arrays.asList(
                new FrontDeskEntity("John", "Doe", LocalDate.parse("1990-01-01")),
                new FrontDeskEntity("Michael", "Doe", LocalDate.parse("1990-01-01")),
                new FrontDeskEntity("Anne", "Doe", LocalDate.parse("1990-01-01"))
        );
        when(frontDeskRepository.findAll()).thenReturn(mockData);

        mockMvc.perform(MockMvcRequestBuilders.get("/staff"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(mockData.size()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("John Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").value("Jane Doe"));
    }

    @Test
    public void testAddOneFrontDesk() throws Exception {
        FrontDeskEntity mockEntity = new FrontDeskEntity("John", "Doe", LocalDate.parse("1990-01-01"));
        when(frontDeskRepository.save(Mockito.any(FrontDeskEntity.class))).thenReturn(mockEntity);

        mockMvc.perform(MockMvcRequestBuilders.post("/staff")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"name\": \"John Doe\" }"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("John Doe"));
    }
}
