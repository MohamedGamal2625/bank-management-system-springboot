package com.global.bankingsystemapi.service;

import com.global.bankingsystemapi.dto.transaction.TransactionRequestDTO;
import com.global.bankingsystemapi.dto.transaction.TransactionResponseDTO;

public interface TransactionService {
    TransactionResponseDTO deposit(TransactionRequestDTO request);
    TransactionResponseDTO withdraw(TransactionRequestDTO request);
    TransactionResponseDTO transfer(TransactionRequestDTO request);
}
