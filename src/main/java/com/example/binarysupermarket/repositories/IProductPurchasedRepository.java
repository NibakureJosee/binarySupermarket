package com.example.binarysupermarket.repositories;


import com.example.binarysupermarket.models.ProductPurchased;
import com.example.binarysupermarket.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IProductPurchasedRepository extends JpaRepository<ProductPurchased, UUID> {
    List<ProductPurchased> findByCustomer(User customer);
}
