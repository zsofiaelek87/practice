package com.example.springpractice.controller;

import com.example.springpractice.model.CharCounter;
import com.example.springpractice.model.InputString;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@CrossOrigin
public class DataRestController {

    @GetMapping( path = "/hello")
    public String hello() {
        return "Szia Hello Zsofi!!!! 4 negy";
    }

    @PostMapping( path = "/input")
    public void input(@RequestParam String inputString) {
        InputString textStore = new InputString();
        textStore.setInputString(inputString);
        System.out.println(inputString);
        }

    @GetMapping( path = "/result")
    public void output() {
        CharCounter charCounter = new CharCounter();
        System.out.println(charCounter.countCharacters(Collections.singletonList("Test input")));;
    }


}

