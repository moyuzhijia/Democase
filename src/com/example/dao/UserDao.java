package com.example.dao;

import com.example.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public int add(User user);

    public int deleteById(String id);

}
