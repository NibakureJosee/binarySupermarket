package com.example.binarysupermarket.repositories;

import com.example.binarysupermarket.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmailOrPhone(String email, String phoneNumber);

    Optional<User> findByEmail(String email);



}
