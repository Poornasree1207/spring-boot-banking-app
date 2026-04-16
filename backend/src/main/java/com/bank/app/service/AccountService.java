package com.bank.app.service;

import com.bank.app.model.Account;

import java.math.BigDecimal;

public interface AccountService {

    Account createAccount(String holderName);

    Account deposit(String accountNumber, BigDecimal amount);

    Account getAccount(String accountNumber);
}