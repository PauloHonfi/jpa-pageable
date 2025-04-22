package br.com.paulohonfi.postgre.domain.usecase.impl;

import br.com.paulohonfi.postgre.domain.model.AccountResponse;
import br.com.paulohonfi.postgre.domain.model.Offset;
import br.com.paulohonfi.postgre.domain.model.entity.Account;
import br.com.paulohonfi.postgre.domain.usecase.AccountUseCase;
import br.com.paulohonfi.postgre.infra.dataprovider.AccountDataProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountUseCaseImpl implements AccountUseCase {

    private final AccountDataProvider dataProvider;

    @Override
    public AccountResponse findAll() {
        return dataProvider.findAll();
    }

    @Override
    public AccountResponse findAllPageable(final Offset offset) {
        return dataProvider.findAllPageable(offset);
    }

    @Override
    public AccountResponse create(final Account account) {
        return dataProvider.create(account);
    }

    @Override
    public AccountResponse createAll(List<Account> accounts) {
        return dataProvider.createAll(accounts);
    }
}
