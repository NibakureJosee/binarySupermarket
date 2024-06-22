package com.example.binarysupermarket.services;

import com.example.binarysupermarket.dtos.CreateOrUpdateProductDTO;
import com.example.binarysupermarket.models.Product;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

public interface IProductService {

    Product findByCode(String code);

    List<Product> all();

    Product register(CreateOrUpdateProductDTO dto);
}
