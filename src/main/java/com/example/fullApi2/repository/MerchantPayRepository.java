package com.example.fullApi2.repository;

import com.example.fullApi2.entitiy.MerchantPay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantPayRepository extends JpaRepository<MerchantPay, Long> {
}
