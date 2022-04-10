package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.entitiy.MerchantPay;
import com.example.fullApi2.error.UserNotFoundException;
import com.example.fullApi2.repository.MerchantPayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MerchantPayImplService implements MerchantPayService {

    @Autowired
    private MerchantPayRepository merchantPayRepository;

    @Override
    public MerchantPay saveMerchant(MerchantPay merchantPay) {
        return merchantPayRepository.save(merchantPay);
    }


    @Override
    public MerchantPay fetchMerchantById(Long id) throws UserNotFoundException {

        Optional<MerchantPay> merchantPay = merchantPayRepository.findById(id);
        if(!merchantPay.isPresent()){
            throw  new UserNotFoundException("this transaction not available");
        }
        return merchantPay.get();

    }
}
