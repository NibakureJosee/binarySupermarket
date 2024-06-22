package com.example.binarysupermarket.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Data
public class CreateOrUpdateProductDTO {

    @NotBlank
    private String code;

    @NotBlank
    private String name;

    @NotBlank
    private String type;

    @NotNull
    private Double price;

    @NotBlank
    private String image;
}
