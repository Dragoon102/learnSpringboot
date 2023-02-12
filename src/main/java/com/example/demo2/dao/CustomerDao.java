package com.example.demo2.dao;


public class CustomerDao {
    private Long id;
    private String customerName;
    public CustomerDao(Long id,String customerName){
        super();
        this.id=id;
        this.customerName=customerName;
    }

    public CustomerDao(){

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
