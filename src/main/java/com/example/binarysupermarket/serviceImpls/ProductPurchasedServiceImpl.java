package com.example.binarysupermarket.serviceImpls;

import com.example.binarysupermarket.dtos.NewProductQuantityDTO;
import com.example.binarysupermarket.dtos.PurchaseProductDTO;
import com.example.binarysupermarket.enums.EProductQuantityOperation;
import com.example.binarysupermarket.models.ProductPurchased;
import com.example.binarysupermarket.models.ProductQuantity;
import com.example.binarysupermarket.models.User;
import com.example.binarysupermarket.repositories.IProductPurchasedRepository;
import com.example.binarysupermarket.services.IProductPurchasedService;
import com.example.binarysupermarket.services.IProductQuantityService;
import com.example.binarysupermarket.services.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class ProductPurchasedServiceImpl implements IProductPurchasedService {

    private final IProductPurchasedRepository repository;

    private final IUserService service;

    private final IProductQuantityService productQuantityService;

    public ProductPurchasedServiceImpl(IProductPurchasedRepository repository, IUserService service, IProductQuantityService productQuantityService) {
        this.repository = repository;
        this.service = service;
        this.productQuantityService = productQuantityService;
    }

    @Override
    public List<ProductPurchased> byLoggedInCustomer() {
        User customer = service.getLoggedInUser();
        return repository.findByCustomer(customer);
    }

    @Override
    public List<ProductPurchased> all() {
        return repository.findAll();
    }

    @Override
    public Page<ProductPurchased> allPaginated(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductPurchased purchase(PurchaseProductDTO dto) {
        User customer = service.getLoggedInUser();

        NewProductQuantityDTO newProductQuantityDTO = new NewProductQuantityDTO(dto.getCode(),dto.getQuantity(), EProductQuantityOperation.OUT);

        ProductQuantity productQuantity = productQuantityService.newQuantity(newProductQuantityDTO);

        ProductPurchased productPurchased = new ProductPurchased(productQuantity,customer);

        return repository.save(productPurchased);
    }
}
