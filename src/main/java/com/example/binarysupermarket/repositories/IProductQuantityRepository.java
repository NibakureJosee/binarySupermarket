package com.example.binarysupermarket.repositories;



import com.example.binarysupermarket.models.Product;
import com.example.binarysupermarket.models.ProductQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IProductQuantityRepository extends JpaRepository<ProductQuantity, UUID> {

    List<ProductQuantity> findByProduct(Product product);
}
