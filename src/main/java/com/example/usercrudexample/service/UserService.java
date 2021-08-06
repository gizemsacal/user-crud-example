package com.example.usercrudexample.Service;

import com.example.usercrudexample.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    public User getUser(Integer id);

    public User updateUser(User user, Integer id);

    public void deleteUser(Integer id);

    public User getUserByName(String name);

    public User getUserByAge(int age);

    public List<User> getAllUsers();
}

