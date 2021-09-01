package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.model.User;
import com.mynewshop.mynewshopapp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void testSave() {
        User u = new User();
        u.setUsername("Taehyungie");
        u.setPassword("kookie");
        User savedUser = userService.save(u);
        assertNotNull(savedUser.getUserId());

    }

    @Test
    public void testReadAll() {
        List<User> list = userService.findAll();
        assertThat(list).size().isGreaterThan(0);
    }

    @Test
    public void testOneUser() {
        User user = userService.findById(126).get();
        assertEquals("Taehyung", user.getUsername());
    }

    @Test
    public void testDelete() {
        userService.deleteById(121);
        User user1 = null;
        Optional<User> user = userService.findById(121);
        if(user.isPresent())
        {
            user1 = user.get();
        }
        assertNull(user1);
    }

    @Test
    public void testUpdate() {
        User user = userService.findById(121).get();
        user.setEmail("aishutae@gmail.com");
        User updatedUser = userService.save(user);
        assertThat(updatedUser.getEmail()).isEqualTo("aishutae@gmail.com");

    }

}