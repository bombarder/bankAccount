package com.bombarder.repository;

import com.bombarder.entity.Account;
import com.bombarder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface AccountDao extends JpaRepository<Account,Long>{

    Account findByUser(User user);

    Account findByDate(BigDecimal date);
}
