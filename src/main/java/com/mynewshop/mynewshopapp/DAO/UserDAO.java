package com.mynewshop.mynewshopapp.DAO;

import com.mynewshop.mynewshopapp.model.User;

import java.util.List;


public interface UserDAO {

    public List<User> loginCheck(User user);
}
