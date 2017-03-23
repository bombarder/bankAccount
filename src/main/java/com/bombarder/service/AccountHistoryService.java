package com.bombarder.service;

import com.bombarder.entity.AccountHistory;
import com.bombarder.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface AccountHistoryService {
    List<AccountHistory> findAll();
    AccountHistory findById(long id);
    AccountHistory findByUser(User user);
    AccountHistory findByDate(BigDecimal date);
}
