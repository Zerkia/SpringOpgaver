package com.example.springopgaver.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import services.DayCalc;

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
    public int erdetfredag(){
        DayCalc dayCalc = new DayCalc();
        return dayCalc.getDay();
    }
}
