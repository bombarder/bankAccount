package com.bombarder.repository;

import com.bombarder.entity.Account;
import com.bombarder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface AccountDao extends JpaRepository<Account,Long>{

    Account findByOwner(User user);
    Account findByDatePlaced(LocalDate datePlaced);
}
