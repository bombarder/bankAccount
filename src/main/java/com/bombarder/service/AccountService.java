package com.bombarder.service;

import com.bombarder.entity.Account;
import com.bombarder.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {

    List<Account> findAll();
    Account findById(long id);
    Account findByOwner(User user);
    Account findByDate(BigDecimal date);
    Account create(Account account);
    void update(Account account);
    void delete(Account account);
}
