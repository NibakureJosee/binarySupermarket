package com.example.binarysupermarket.dtos;


import com.example.binarysupermarket.security.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {

    @NotBlank
    private  String firstname;

    @Email
    private  String email;

    @NotBlank
    @Pattern(regexp = "[0-9]{9,10}", message = "Your phone is not a valid tel we expect 07***")
    private  String phone;

    @ValidPassword
    private  String password;
}
