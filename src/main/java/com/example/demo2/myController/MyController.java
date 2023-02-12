package com.example.demo2.myController;

import com.example.demo2.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    CustomerRepo cRepo;

    @GetMapping("/myFirstApi")
    public String testApi(){
        return "Hello, api test successful";
    }

    @PostMapping("/saveCustomer")
    public Customer savCust(){

        Customer cus=new Customer(1000L,"Jack");
        return cRepo .save(cus) ;
    }
}
