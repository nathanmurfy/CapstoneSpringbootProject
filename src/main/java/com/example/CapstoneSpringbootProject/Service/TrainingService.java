package com.example.CapstoneSpringbootProject.Service;

import com.example.CapstoneSpringbootProject.Entity.Trainer;
import com.example.CapstoneSpringbootProject.Repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    public void insertTraining(Training training) {
        trainingRepository.insertTraining(training);
    }

}
