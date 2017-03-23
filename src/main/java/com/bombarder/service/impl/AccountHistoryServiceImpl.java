package com.bombarder.service.impl;

import com.bombarder.entity.AccountHistory;
import com.bombarder.entity.User;
import com.bombarder.repository.AccountHistoryDao;
import com.bombarder.service.AccountHistoryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountHistoryServiceImpl implements AccountHistoryService {

    AccountHistoryDao accountHistoryDao;

    public AccountHistoryServiceImpl(AccountHistoryDao accountHistoryDao) {
        this.accountHistoryDao = accountHistoryDao;
    }

    @Override
    public List<AccountHistory> findAll() {
        return accountHistoryDao.findAll();
    }

    @Override
    public AccountHistory findById(long id) {
        return accountHistoryDao.findById(id);
    }

    @Override
    public AccountHistory findByUser(User user) {
        return accountHistoryDao.findByUser(user);
    }

    @Override
    public AccountHistory findByDate(BigDecimal date) {
        return accountHistoryDao.findByDate(date);
    }
}
