package com.example.demo2.services;

import com.example.demo2.dto.ProductDto;
import com.example.demo2.entity.ProductEntity;
import com.example.demo2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    @Autowired
    ProductRepo productRepo;
    public ProductDto getProd(Long id) {
        ProductEntity productEntity=productRepo.findById(id).get();

        ProductDto productDto=new ProductDto();
        productDto.setProductId(productEntity.getProductId());
        productDto.setProductName(productEntity.getProductName());
        productDto.setProductDesc(productEntity.getProductDesc());
        productDto.setProductPrice(productEntity.getProductPrice());

        return productDto;
    }


    public ProductEntity saveProduct(ProductDto productDto) {
        ProductEntity productEntity=new ProductEntity();

        productEntity.setProductName(productDto.getProductName());
        productEntity.setProductDesc(productDto.getProductDesc());
        productEntity.setProductPrice(productDto.getProductPrice());

        return productRepo.save(productEntity);
    }
}
