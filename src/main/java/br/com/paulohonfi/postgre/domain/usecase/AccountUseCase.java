package br.com.paulohonfi.postgre.domain.usecase;

import br.com.paulohonfi.postgre.domain.model.AccountResponse;
import br.com.paulohonfi.postgre.domain.model.Offset;
import br.com.paulohonfi.postgre.domain.model.entity.Account;

import java.util.List;

public interface AccountUseCase {

    /**
     * Retrieve all accounts.
     *
     * @return a list of Account objects
     */
    public AccountResponse findAll();

    /**
     * Retrieve all accounts with pagination.
     *
     * @param offset the Offset object containing pagination information
     * @return a list of Account objects
     */
    public AccountResponse findAllPageable(final Offset offset);

    /**
     * Create a new account.
     *
     * @param account the Account object to be created
     * @return a ResponseEntity containing the created Account object
     */
    public AccountResponse create(final Account account);

    /**
     * Create multiple accounts.
     *
     * @param accounts a list of Account objects to be created
     * @return a list of created Account objects
     */
    public AccountResponse createAll(final List<Account> accounts);
}
