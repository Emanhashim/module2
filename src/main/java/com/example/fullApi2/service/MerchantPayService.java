package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.entitiy.MerchantPay;
import com.example.fullApi2.error.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface MerchantPayService {
    public MerchantPay saveMerchant(MerchantPay merchantPay);

    public MerchantPay fetchMerchantById(Long id) throws UserNotFoundException;
}
