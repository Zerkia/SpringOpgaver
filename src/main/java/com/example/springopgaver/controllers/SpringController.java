package com.example.springopgaver.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import services.DayCalc;

import java.time.LocalDate;
import java.util.Locale;

@RestController
public class SpringController {
    @GetMapping("/hellospring")
    public String helloSpring() {
        return "<b>Hello Spring<b>";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return input;
    }

    @GetMapping("/erdetfredag")
    public String erdetfredag(){
        DayCalc dayCalc = new DayCalc();
        LocalDate date = LocalDate.now();

        if(dayCalc.getDay() == 5){
            return "Det er fredag! God weekend!";
        } else {
            //Needs to be danish
            return "Det er ikke fredag, det er " + date.getDayOfWeek().toString().toLowerCase();
        }
    }
}
