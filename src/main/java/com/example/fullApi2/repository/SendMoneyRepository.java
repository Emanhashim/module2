package com.example.fullApi2.repository;

import com.example.fullApi2.entitiy.SendMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SendMoneyRepository extends JpaRepository<SendMoney, Long> {
}
