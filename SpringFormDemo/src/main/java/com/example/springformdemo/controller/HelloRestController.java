package com.example.springformdemo.controller;

import com.example.springformdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloRestController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String hello() {
        return "hello";
    }

    @PostMapping("/")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
