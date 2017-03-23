package com.bombarder.repository;

import com.bombarder.entity.AccountHistory;
import com.bombarder.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface AccountHistoryDao {

    List<AccountHistory> findAll();
    AccountHistory findById(long id);
    AccountHistory findByUser(User user);
    AccountHistory findByDate(BigDecimal date);
}
