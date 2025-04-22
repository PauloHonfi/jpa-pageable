package br.com.paulohonfi.postgre.infra.dataprovider;

import br.com.paulohonfi.postgre.domain.model.AccountResponse;
import br.com.paulohonfi.postgre.domain.model.Offset;
import br.com.paulohonfi.postgre.domain.model.entity.Account;

import java.util.List;

public interface AccountDataProvider {

    public AccountResponse findAll();

    public AccountResponse findAllPageable(final Offset offset);

    public AccountResponse create(final Account account);

    public AccountResponse createAll(List<Account> accounts);
}
