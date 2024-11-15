package com.sameerasw.ticketin.server.controller;

import com.sameerasw.ticketin.server.model.Transaction;
import com.sameerasw.ticketin.server.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    // Add other controller methods for Transaction operations
}