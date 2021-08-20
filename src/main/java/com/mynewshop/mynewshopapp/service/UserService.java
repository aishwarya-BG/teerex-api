package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> loginCheck(User user);

    public Optional<User> findById(Integer theId);

    List<User> findAll();

    public void save(User user);

    void deleteById(Integer theId);
}
