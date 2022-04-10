package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.entitiy.SendMoney;
import com.example.fullApi2.error.UserNotFoundException;
import com.example.fullApi2.repository.SendMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SendMoneyImplService implements SendMoneyService{

    @Autowired
    private SendMoneyRepository sendMoneyRepository;

    @Override
    public SendMoney saveMoney(SendMoney sendMoney) {
        return sendMoneyRepository.save(sendMoney);
    }

    @Override
    public SendMoney fetchMoneyById(Long id) throws UserNotFoundException {
        Optional<SendMoney> sendMoney = sendMoneyRepository.findById(id);
        if(!sendMoney.isPresent()){
            throw  new UserNotFoundException("this transaction not available");
        }
        return sendMoney.get();
    }
}
