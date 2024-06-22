package com.example.binarysupermarket.services;

import com.example.binarysupermarket.dtos.NewProductQuantityDTO;
import com.example.binarysupermarket.models.ProductQuantity;

import java.util.List;
import java.util.UUID;

public interface IProductQuantityService {

    Integer byProduct(String productCode);

    ProductQuantity newQuantity(NewProductQuantityDTO dto);
}
