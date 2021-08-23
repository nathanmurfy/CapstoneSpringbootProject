package com.example.CapstoneSpringbootProject;

import com.example.CapstoneSpringbootProject.Controller.TrainerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TrainerController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getListSample(){
        assertThat(controller).isNotNull();
    }

    @Test
    public void checkIfExercisePrints() {
        assertThat(controller).isNotNull();
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/exercises",
                String.class)).contains("exercises");

    }



}
