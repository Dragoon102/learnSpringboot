package com.example.demo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// entity deals with repository to save data in database.
// dao takes in the data and then we process over that data.(dao is a POJO ~
// plain old java object)
@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String customerName;
    public CustomerEntity(Long id, String customerName){
        super();
        this.id=id;
        this.customerName=customerName;
    }

    public CustomerEntity(){

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
