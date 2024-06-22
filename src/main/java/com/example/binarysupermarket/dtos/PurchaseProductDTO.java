package com.example.binarysupermarket.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class PurchaseProductDTO {

    @NotBlank
    private String code;

    @NotNull
    private Integer quantity;
}