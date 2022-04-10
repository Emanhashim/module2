package com.example.fullApi2.controller;


import com.example.fullApi2.entitiy.*;
import com.example.fullApi2.error.UserNotFoundException;
import com.example.fullApi2.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BankController {

    @Autowired
    private SendMoneyService sendMoneyService;

    @Autowired
    private BankTransferService bankTransferService;

    @Autowired
    private MerchantPayService merchantPayService;

    @Autowired
    private AgentIdService agentIdService;

    @Autowired
    private DepositService depositService;


    private final Logger LOGGER =
            LoggerFactory.getLogger(BankController.class);

    @PostMapping("/bankTransfer")
    public ResponseEntity<BankTransfer> saveUser(@Valid @RequestBody BankTransfer bankTransfer){
        LOGGER.info("inside saveUser of UserController");
        return new ResponseEntity<BankTransfer>( bankTransferService.saveBank(bankTransfer), HttpStatus.CREATED);
    }

    @GetMapping("/bankTransfer/{id}")
    public BankTransfer fetchUsers( @Valid @PathVariable("id") Long id)
            throws UserNotFoundException {
        return  bankTransferService.fetchBankById(id);
    }

//    this for send money and get by id

@PostMapping("/sendMoney")
public ResponseEntity<SendMoney> saveMoney(@Valid @RequestBody SendMoney sendMoney){
    LOGGER.info("inside saveUser of UserController");
    return new ResponseEntity<SendMoney>( sendMoneyService.saveMoney(sendMoney), HttpStatus.CREATED);
}


    @GetMapping("/sendMoney/{id}")
    public SendMoney fetchMoneyById( @Valid @PathVariable("id") Long id)
            throws UserNotFoundException {
        return  sendMoneyService.fetchMoneyById(id);
    }

//    this for merchant
@PostMapping("/merchantPay")
public ResponseEntity<MerchantPay> merchantPay(@Valid @RequestBody MerchantPay merchantPay){
    LOGGER.info("inside saveUser of UserController");
    return new ResponseEntity<MerchantPay>(merchantPayService.saveMerchant (merchantPay), HttpStatus.CREATED);
}

    @GetMapping("/merchantPay/{id}")
    public MerchantPay fetchMerchantById( @Valid @PathVariable("id") Long id)
            throws UserNotFoundException {
        return  merchantPayService.fetchMerchantById(id);
    }

//    this for agent pay insert and fetch
@PostMapping("/agentPay")
public ResponseEntity<AgentId> agentPay(@Valid @RequestBody AgentId agentId){
    LOGGER.info("inside saveUser of UserController");
    return new ResponseEntity<AgentId>(agentIdService.saveAgent(agentId), HttpStatus.CREATED);
}

    @GetMapping("/agentPay/{id}")
    public AgentId fetchAgentById(@Valid @PathVariable("id") Long id)
            throws UserNotFoundException {
        return  agentIdService.fetchAgentById(id);
    }

//    this for money deposit


    @PostMapping("/depositMoney")
    public ResponseEntity<DepositMoney> depositPay(@Valid @RequestBody DepositMoney depositMoney){
        LOGGER.info("inside saveUser of UserController");
        return new ResponseEntity<DepositMoney>(depositService.saveDeposit(depositMoney), HttpStatus.CREATED);
    }

    @GetMapping("/depositMoney/{id}")
    public DepositMoney fetchDepositById(@Valid @PathVariable("id") Long id)
            throws UserNotFoundException {
        return  depositService.fetchDepositById(id);
    }

}
