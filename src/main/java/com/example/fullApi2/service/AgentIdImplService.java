package com.example.fullApi2.service;

import com.example.fullApi2.entitiy.AgentId;
import com.example.fullApi2.entitiy.MerchantPay;
import com.example.fullApi2.error.UserNotFoundException;
import com.example.fullApi2.repository.AgentIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgentIdImplService implements AgentIdService{

    @Autowired
    private AgentIdRepository agentIdRepository;

    @Override
    public AgentId saveAgent(AgentId agentId) {
        return agentIdRepository.save(agentId);
    }

    @Override
    public AgentId fetchAgentById(Long id) throws UserNotFoundException {
        Optional<AgentId> agentId = agentIdRepository.findById(id);
        if(!agentId.isPresent()){
            throw  new UserNotFoundException("this transaction not available");
        }
        return agentId.get();
    }
}
