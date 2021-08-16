package com.example.CapstoneSpringbootProject.Controller;


import com.example.CapstoneSpringbootProject.Service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/training")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @PostMapping
    public void insertTraining(Training training){
        trainingService.insertTraining(training);
    }
}
