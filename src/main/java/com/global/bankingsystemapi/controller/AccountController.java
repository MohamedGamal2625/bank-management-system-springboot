package com.global.bankingsystemapi.controller;

import com.global.bankingsystemapi.dto.account.AccountRequestDTO;
import com.global.bankingsystemapi.dto.account.AccountResponseDTO;
import com.global.bankingsystemapi.entity.Account;
import com.global.bankingsystemapi.entity.enums.AccountStatus;
import com.global.bankingsystemapi.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountResponseDTO>createAccount(@RequestBody AccountRequestDTO request) {
        AccountResponseDTO res = accountService.createAccount(request);
        return new  ResponseEntity<>(res,HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AccountResponseDTO> getAccount(@PathVariable Long id){
        AccountResponseDTO res =accountService.getAccountById(id);
        return ResponseEntity.ok(res);
    }
    @GetMapping
    public ResponseEntity<List<AccountResponseDTO>> getAllAccounts(){
        List<AccountResponseDTO> res =accountService.getAllAccounts();
        return ResponseEntity.ok(res);
    }
    @PatchMapping("/{id}/status")
    public ResponseEntity<AccountResponseDTO> updateStatus(@PathVariable Long id, @RequestParam AccountStatus status) {
    AccountResponseDTO res=accountService.updateAccountStatus(id,status);
    return ResponseEntity.ok(res);
    }
}
