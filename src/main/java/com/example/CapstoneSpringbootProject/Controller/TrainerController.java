package com.example.CapstoneSpringbootProject.Controller;


import com.example.CapstoneSpringbootProject.Entity.Trainer;
import com.example.CapstoneSpringbootProject.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("api/trainer")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @PostMapping("/add")
    public void insertTrainer(Trainer trainer){
        trainerService.insertTrainer(trainer);
    }
}
