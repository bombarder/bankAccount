package com.bombarder.repository;

import com.bombarder.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
    User findById(long id);
    User findByLogin(String login);
    User findByEmail(String email);
    User create(User user);
    void update(User user);
    void delete(User user);
}
