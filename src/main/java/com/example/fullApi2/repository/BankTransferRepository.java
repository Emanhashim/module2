package com.example.fullApi2.repository;

import com.example.fullApi2.entitiy.BankTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTransferRepository extends JpaRepository<BankTransfer, Long> {
}
