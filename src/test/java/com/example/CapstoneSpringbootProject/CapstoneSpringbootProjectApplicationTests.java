package com.example.CapstoneSpringbootProject;

import com.example.CapstoneSpringbootProject.Entity.Trainer;
import com.example.CapstoneSpringbootProject.Repository.TrainerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CapstoneSpringbootProjectApplicationTests {

	@Autowired
	TrainerRepository trainerRepository;
	@Test
	void contextLoads() {
	}

}
