package br.com.paulohonfi.postgre.domain.usecase;

import br.com.paulohonfi.postgre.domain.entity.Account;

import java.util.List;

public interface AccountUseCase {

    /**
     * Retrieve all accounts.
     *
     * @return a list of Account objects
     */
    public List<Account> findAll();

    /**
     * Create a new account.
     *
     * @param account the Account object to be created
     * @return a ResponseEntity containing the created Account object
     */
    public Account create(final Account account);
}
