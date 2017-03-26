package com.bombarder.service.impl;

import com.bombarder.entity.Account;
import com.bombarder.entity.User;
import com.bombarder.repository.AccountDao;
import com.bombarder.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(long id) {
        return accountDao.findOne(id);
    }

    @Override
    public Account findByOwner(User user) {
        return accountDao.findByOwner(user);
    }

    @Override
    public Account findByDate(LocalDate date) {
        return accountDao.findByDatePlaced(date);
    }

    @Override
    public Account create(Account account) {
        return accountDao.save(account);
    }

    @Override
    public void delete(Account account) {
        accountDao.delete(account);
    }
}
