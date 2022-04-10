package com.example.fullApi2.repository;

import com.example.fullApi2.entitiy.DepositMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<DepositMoney, Long> {
}
