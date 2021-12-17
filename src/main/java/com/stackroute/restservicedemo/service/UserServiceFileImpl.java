package com.stackroute.restservicedemo.service;

import com.stackroute.restservicedemo.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserServiceFileImpl implements UserService{
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUser() {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByIdThroughRequestParam(int id) {

    }

    @Override
    public void updateUser(User user) {

    }
}
