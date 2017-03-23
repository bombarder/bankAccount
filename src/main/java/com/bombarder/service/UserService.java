package com.bombarder.service;

import com.bombarder.entity.User;

import java.util.List;

public interface UserService {

    User create(User user);
    List<User> findAll();
    User findById(long id);
    User findByLogin(String login);
    User findByEmail(String email);
    void update(User user);
    void delete(User user);
}
