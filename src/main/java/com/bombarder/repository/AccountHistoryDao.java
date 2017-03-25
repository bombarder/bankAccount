package com.bombarder.repository;

import com.bombarder.entity.AccountHistory;
import com.bombarder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface AccountHistoryDao extends JpaRepository<AccountHistory, Long> {

    AccountHistory findByUser(User user);

    AccountHistory findByDate(BigDecimal date);
}
