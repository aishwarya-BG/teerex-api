package com.mynewshop.mynewshopapp.controller;


import com.mynewshop.mynewshopapp.DAO.UserDAO;
import com.mynewshop.mynewshopapp.model.User;
import com.mynewshop.mynewshopapp.repository.UserRepository;
import com.mynewshop.mynewshopapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("userapi")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public List<User> detailsCheck(@RequestBody User user)
    {
        List<User> theuser;
        theuser=userService.loginCheck(user);
        return theuser;
    }

    @GetMapping("users")
    public List<User> getUsers()
    {
        return userService.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("users/{theId}")
    public Optional<User> findById(@PathVariable Integer theId)
    {
        return userService.findById(theId);
    }

    @DeleteMapping("users/{theId}")
    public void deleteById(@PathVariable Integer theId)
    {
        userService.deleteById(theId);
    }


}
