package com.bombarder.repository;

import com.bombarder.entity.Account;
import com.bombarder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface AccountDao extends JpaRepository<Account,Long>{

    Account findByOwner(User user);
    Account findByDatePlaced(LocalDate datePlaced);
}
