package com.example.CapstoneSpringbootProject.Controller;


import com.example.CapstoneSpringbootProject.Entity.Trainer;
import com.example.CapstoneSpringbootProject.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Controller
public class TrainerController {

    @GetMapping
    String getTraining(Model model){
        model.addAttribute("something", "this is from the controller");
        model.addAttribute("training", Arrays.asList(
                new Trainer("Bench", 100, 10, 2),
                new Trainer("Squat", 160, 15, 3),
                new Trainer("Deadlift", 200, 10, 3)
        ));
        return "training";
    }

}
