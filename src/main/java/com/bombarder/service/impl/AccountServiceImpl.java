package com.bombarder.service.impl;

import com.bombarder.entity.Account;
import com.bombarder.entity.User;
import com.bombarder.repository.AccountDao;
import com.bombarder.service.AccountService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(long id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByOwner(User user) {
        return accountDao.findByOwner(user);
    }

    @Override
    public Account findByDate(BigDecimal date) {
        return accountDao.findByDate(date);
    }

    @Override
    public Account create(Account account) {
        return accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Account account) {
        accountDao.delete(account);
    }
}
