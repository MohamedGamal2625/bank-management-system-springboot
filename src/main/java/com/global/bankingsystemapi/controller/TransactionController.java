package com.global.bankingsystemapi.controller;

import com.global.bankingsystemapi.dto.transaction.TransactionRequestDTO;
import com.global.bankingsystemapi.dto.transaction.TransactionResponseDTO;
import com.global.bankingsystemapi.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping("/deposit")
    public ResponseEntity<TransactionResponseDTO> deposit(@RequestBody TransactionRequestDTO request) {
        TransactionResponseDTO response = transactionService.deposit(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<TransactionResponseDTO> withdraw(@RequestBody TransactionRequestDTO request) {
        TransactionResponseDTO response = transactionService.withdraw(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    //  Transfer money
    @PostMapping("/transfer")
    public ResponseEntity<TransactionResponseDTO> transfer(@RequestBody TransactionRequestDTO request) {
        TransactionResponseDTO response = transactionService.transfer(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}