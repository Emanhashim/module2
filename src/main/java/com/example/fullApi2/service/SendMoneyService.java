package com.example.fullApi2.service;


import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.entitiy.SendMoney;
import com.example.fullApi2.error.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface SendMoneyService {

    public SendMoney saveMoney(SendMoney sendMoney);

    public SendMoney fetchMoneyById(Long id) throws UserNotFoundException;


}
