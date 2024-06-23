package com.example.binarysupermarket.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
