package com.bombarder.repository;

import com.bombarder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByLogin(String login);
}
