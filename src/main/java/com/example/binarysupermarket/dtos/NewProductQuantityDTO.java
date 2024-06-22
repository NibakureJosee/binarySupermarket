package com.example.binarysupermarket.dtos;

import com.example.binarysupermarket.enums.EProductQuantityOperation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewProductQuantityDTO {

    @NotBlank
    private String code;

    @NotNull
    private Integer quantity;

    @NotNull
    private EProductQuantityOperation operation;
}