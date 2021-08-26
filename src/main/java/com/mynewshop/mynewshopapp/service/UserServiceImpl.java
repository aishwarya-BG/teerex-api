package com.mynewshop.mynewshopapp.service;

import com.mynewshop.mynewshopapp.DAO.UserDAO;
import com.mynewshop.mynewshopapp.model.User;
import com.mynewshop.mynewshopapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> loginCheck(User user) {
        List<User> theuser;
        theuser=userDAO.loginCheck(user);
        return theuser;
    }

    @Override
    public Optional<User> findById(Integer theId) {
        return userRepository.findById(theId);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Integer theId) {
        userRepository.deleteById(theId);
    }


}
