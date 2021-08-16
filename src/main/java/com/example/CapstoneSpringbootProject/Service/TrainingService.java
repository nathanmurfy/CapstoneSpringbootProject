package com.example.CapstoneSpringbootProject.Service;


import com.example.CapstoneSpringbootProject.Repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    public insertTraining(Training Training) {
        trainingRepository.insertTraining(training);
    }

}
