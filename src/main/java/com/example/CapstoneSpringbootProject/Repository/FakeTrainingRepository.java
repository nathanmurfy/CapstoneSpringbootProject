package com.example.CapstoneSpringbootProject.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeTrainingRepository<Training> implements TrainingRepository {
    List<Training> trainingList = new ArrayList<>();

    public void insertTraining(Training training) {
        trainingList.add(training);
    }
}
