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

@Controller
public class TrainerController {

    @GetMapping
    String getTrainer(Model model){
        model.addAttribute("something", "this is from the controller");
        return "trainer";
    }

}
