package com.bank.app.repository;

import com.bank.app.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.sppringframework.stereotype.Repository;


import java.util.*;

@Repository

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByAccountNumber(String accountNummber);
} 