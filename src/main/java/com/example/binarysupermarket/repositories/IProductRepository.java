package com.example.binarysupermarket.repositories;

import com.example.binarysupermarket.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product,String> {
}
