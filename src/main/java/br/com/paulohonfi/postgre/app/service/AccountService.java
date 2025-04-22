package br.com.paulohonfi.postgre.app.service;

import br.com.paulohonfi.postgre.domain.entity.Account;
import br.com.paulohonfi.postgre.domain.usecase.AccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountUseCase useCase;

    public List<Account> findAll() {
        return useCase.findAll();
    }

    public Account create(final Account account) {
        return useCase.create(account);
    }

    public List<Account> createAll(final List<Account> accounts) {
        return useCase.createAll(accounts);
    }
}
