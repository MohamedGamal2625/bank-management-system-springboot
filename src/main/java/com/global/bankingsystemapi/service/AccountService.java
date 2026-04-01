package com.global.bankingsystemapi.service;

import com.global.bankingsystemapi.dto.account.AccountRequestDTO;
import com.global.bankingsystemapi.dto.account.AccountResponseDTO;
import com.global.bankingsystemapi.entity.enums.AccountStatus;

import java.util.List;

public interface AccountService {
    AccountResponseDTO createAccount(AccountRequestDTO request);
    AccountResponseDTO getAccountById(Long id);
    List<AccountResponseDTO> getAllAccounts();
    AccountResponseDTO updateAccountStatus(Long id, AccountStatus status);
}
