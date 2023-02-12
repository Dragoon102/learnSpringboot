package com.example.demo2.controller;

import com.example.demo2.dao.CustomerDao;
import com.example.demo2.entity.CustomerEntity;
import com.example.demo2.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public CustomerEntity savCust( @RequestBody CustomerDao customer){

        CustomerEntity cus=new CustomerEntity();
        cus.setCustomerName(customer.getCustomerName());
//        cus.setId(customer.getId());

        return cRepo .save(cus) ;
    }
}
