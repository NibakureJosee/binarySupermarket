package com.example.binarysupermarket.models;

import com.example.binarysupermarket.enums.ERole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@OnDelete(action = OnDeleteAction.CASCADE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "phone", unique = true, length = 100)
    private String phone;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private ERole role = ERole.CUSTOMER;

    @JsonIgnore
    @NotBlank
    @Column(name = "password")
    private String password;

    // Constructors
    public User(String firstName, String phone, String email) {
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
    }

    public User(String firstName, String phone, String email, ERole role) {
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public User(String firstName, String phone, String email, String password) {
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public User(String firstName, String phone, String email, String password, ERole role) {
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
