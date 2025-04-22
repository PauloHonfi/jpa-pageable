package br.com.paulohonfi.postgre.domain.usecase.impl;

import br.com.paulohonfi.postgre.domain.entity.Account;
import br.com.paulohonfi.postgre.domain.usecase.AccountUseCase;
import br.com.paulohonfi.postgre.infra.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountUseCaseImpl implements AccountUseCase {

    private final AccountRepository repository;

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account create(final Account account) {
        return repository.save(account);
    }
}
