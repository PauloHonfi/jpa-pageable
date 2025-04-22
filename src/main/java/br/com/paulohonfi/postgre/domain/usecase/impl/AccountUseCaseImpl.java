package br.com.paulohonfi.postgre.domain.usecase.impl;

import br.com.paulohonfi.postgre.domain.entity.Account;
import br.com.paulohonfi.postgre.domain.usecase.AccountUseCase;
import br.com.paulohonfi.postgre.infra.repository.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AccountUseCaseImpl implements AccountUseCase {

    private final AccountRepository repository;

    @Override
    public List<Account> findAll() {
        log.info("Recuperando todos os registros de conta do banco");
        return repository.findAll();
    }

    @Override
    public Account create(final Account account) {
        log.info("Criando um novo registro de conta no banco");
        return repository.save(account);
    }
}
