package com.global.bankingsystemapi.dto.account;

import com.global.bankingsystemapi.dto.transaction.TransactionResponseDTO;
import com.global.bankingsystemapi.entity.Transaction;
import com.global.bankingsystemapi.entity.enums.AccountStatus;
import com.global.bankingsystemapi.entity.enums.AccountType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountResponseDTO {
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private AccountType accountType;
    private AccountStatus status;
    private Long customerId;
    private List<TransactionResponseDTO> sentTransactions = new ArrayList<>();
    private List<TransactionResponseDTO> receivedTransactions = new ArrayList<>();
}
