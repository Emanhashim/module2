package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.error.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface BankTransferService {
    public BankTransfer saveBank(BankTransfer bankTransfer);

    public  BankTransfer fetchBankById(Long id) throws UserNotFoundException;
}
