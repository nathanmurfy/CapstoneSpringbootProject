package com.example.CapstoneSpringbootProject.Repository;

import org.springframework.stereotype.Repository;
import com.example.CapstoneSpringbootProject.Entity.Trainer;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeTrainingRepository implements TrainingRepository {
   List<Training> trainingList = new ArrayList<>();

   @Override
    public void insertTraining(Training training){
       trainingList.add(training);
   }
}
