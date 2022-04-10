package com.example.fullApi2.repository;

import com.example.fullApi2.entitiy.AgentId;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface AgentIdRepository  extends JpaRepository<AgentId ,Long> {
}
