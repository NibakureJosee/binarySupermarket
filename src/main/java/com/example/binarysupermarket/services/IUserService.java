package com.example.binarysupermarket.services;


import com.example.binarysupermarket.models.User;

public interface IUserService {

    User create(User user);

    boolean isNotUnique(User user);

    void validateNewRegistration(User user);

    User getLoggedInUser();

}