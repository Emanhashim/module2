package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.error.UserNotFoundException;
import com.example.fullApi2.repository.BankTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankTransferImplService implements BankTransferService {

    @Autowired
    private BankTransferRepository bankTransferRepository;


    @Override
    public BankTransfer saveBank(BankTransfer bankTransfer) {
        return bankTransferRepository.save(bankTransfer);
    }

    @Override
    public BankTransfer fetchBankById(Long id) throws UserNotFoundException {
        Optional<BankTransfer> bankTransfer = bankTransferRepository.findById(id);
        if(!bankTransfer.isPresent()){
            throw  new UserNotFoundException("this transaction not available");
        }
        return bankTransfer.get();
    }


}
