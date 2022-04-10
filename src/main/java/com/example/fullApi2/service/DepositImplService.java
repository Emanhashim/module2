package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.DepositMoney;
import com.example.fullApi2.entitiy.MerchantPay;
import com.example.fullApi2.error.UserNotFoundException;
import com.example.fullApi2.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepositImplService implements DepositService{

    @Autowired
    private DepositRepository depositRepository;


    @Override
    public DepositMoney saveDeposit(DepositMoney depositMoney) {
        return depositRepository.save(depositMoney);
    }

    @Override
    public DepositMoney fetchDepositById(Long id) throws UserNotFoundException {
        Optional<DepositMoney> depositMoney = depositRepository.findById(id);
        if(!depositMoney.isPresent()){
            throw  new UserNotFoundException("this transaction not available");
        }
        return depositMoney.get();


    }
}
