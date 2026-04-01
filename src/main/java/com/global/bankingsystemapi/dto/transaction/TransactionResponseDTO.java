package com.global.bankingsystemapi.dto.transaction;

import com.global.bankingsystemapi.entity.enums.TransactionType;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDTO {
    private Long id;
    private BigDecimal amount;
    private TransactionType type;
    private Long sourceAccountId;
    private Long targetAccountId;
    private LocalDateTime createdAt;
}
