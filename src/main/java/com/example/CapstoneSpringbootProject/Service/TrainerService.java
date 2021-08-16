package com.example.CapstoneSpringbootProject.Service;

import com.example.CapstoneSpringbootProject.Entity.Trainer;
import com.example.CapstoneSpringbootProject.Repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainingRepository;

    public void insertTrainer(Trainer trainer) {
        trainingRepository.save(trainer);
    }

}
