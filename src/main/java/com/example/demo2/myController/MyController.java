package com.example.demo2.myController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/myFirstApi")
    public String testApi(){
        return "Hello, api test successful";
    }
}
