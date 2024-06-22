package com.example.binarysupermarket.services;

import com.example.binarysupermarket.dtos.PurchaseProductDTO;
import com.example.binarysupermarket.models.ProductPurchased;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IProductPurchasedService {

    List<ProductPurchased> byLoggedInCustomer();

    List<ProductPurchased> all();

    Page<ProductPurchased> allPaginated(Pageable pageable);


    ProductPurchased purchase(PurchaseProductDTO dto);
}
