package com.example.binarysupermarket.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;


@Data
public class PurchaseProductDTO {

    @NotBlank
    private String code;

    @NotNull
    private Integer quantity;
}