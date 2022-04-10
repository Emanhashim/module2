package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.AgentId;
import com.example.fullApi2.entitiy.BankTransfer;
import com.example.fullApi2.error.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface AgentIdService {
    public AgentId saveAgent(AgentId agentId);

    public  AgentId fetchAgentById(Long id) throws UserNotFoundException;
}
