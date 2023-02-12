package com.example.demo2.controller;

import com.example.demo2.dto.ProductDto;
import com.example.demo2.entity.ProductEntity;
import com.example.demo2.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductServices productServices;

    @PostMapping("/saveProduct")
    public ProductEntity saveProd(@RequestBody ProductDto productDto){
        return productServices.saveProduct(productDto);
    }

    @GetMapping("/get-product-by-id-requestParam")
    public ProductDto getProd(@RequestParam ("id") Long id){
        return productServices.getProd(id);
    }
}
