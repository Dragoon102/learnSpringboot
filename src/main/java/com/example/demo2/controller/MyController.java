package com.example.demo2.controller;

import com.example.demo2.dao.CustomerDao;
import com.example.demo2.entity.CustomerEntity;
import com.example.demo2.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    CustomerRepo cRepo;

    @GetMapping("/myFirstApi")
    public String testApi(){
        return "Hello, api test successful";
    }

    @PostMapping("/saveCustomer")
    public CustomerEntity savCus( @RequestBody CustomerDao customer){

        CustomerEntity cus=new CustomerEntity();
        cus.setCustomerName(customer.getCustomerName());
        cus.setAddress(customer.getAddress());
        cus.setAge(customer.getAge());
        return cRepo .save(cus) ;
    }

    @GetMapping("/getAllCustomers")
    public List<CustomerEntity> getCus(){
        return cRepo.findAll();
    }

    @PutMapping("/updateCustomer")
    public CustomerEntity updateCus(@RequestBody CustomerDao customer){
        Optional<CustomerEntity> c=cRepo.findById(customer.getId());
        CustomerEntity customerEntity=c.get();

        customerEntity.setAge(customer.getAge());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setCustomerName(customer.getCustomerName());

        return cRepo.save(customerEntity);
    }

    @DeleteMapping("/deleteCustomer")
    public void deleteCus(@RequestBody CustomerDao customer){
        Optional<CustomerEntity> c=cRepo.findById(customer.getId());
        CustomerEntity customerEntity=c.get();

        cRepo.delete(customerEntity);
    }
}
