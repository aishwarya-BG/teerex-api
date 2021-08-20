package com.mynewshop.mynewshopapp.repository;

import com.mynewshop.mynewshopapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
