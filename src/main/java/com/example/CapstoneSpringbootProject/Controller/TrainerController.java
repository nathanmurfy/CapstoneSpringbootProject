package com.example.CapstoneSpringbootProject.Controller;


import com.example.CapstoneSpringbootProject.Entity.Trainer;
import com.example.CapstoneSpringbootProject.Repository.TrainerRepository;
import com.example.CapstoneSpringbootProject.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrainerController {
    @Autowired
    TrainerService trainerService;

    @Autowired
    TrainerRepository trainerRepository;

    @GetMapping
    String getTraining(Model model){
        Iterable<Trainer> trainers=trainerRepository.findAll();

        model.addAttribute("something", "Workout Tracker");
        model.addAttribute("training", trainers);

        return "index";
    }
    @PostMapping("/submitExercise")
    String submitTrainer(@ModelAttribute("trainer") Trainer trainer,Model model){
        trainerService.insertTrainer(trainer);
        Iterable<Trainer> trainers=trainerRepository.findAll();
        model.addAttribute("training", trainers);
        return "index";
    }


}
