package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.entitiy.DepositMoney;
import com.example.fullApi2.error.UserNotFoundException;

import org.springframework.stereotype.Service;

@Service
public interface DepositService {

    public DepositMoney saveDeposit(DepositMoney depositMoney);

    public  DepositMoney fetchDepositById(Long id) throws UserNotFoundException;
}
