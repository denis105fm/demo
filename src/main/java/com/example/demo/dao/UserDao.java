package com.example.demo.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
    User getUserById(long id);
    void updateUser(User user);
    void deleteUser(long id);
}
