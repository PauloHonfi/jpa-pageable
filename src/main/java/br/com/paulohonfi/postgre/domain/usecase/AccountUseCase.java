package br.com.paulohonfi.postgre.domain.usecase;

import br.com.paulohonfi.postgre.domain.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountUseCase {

    /**
     * Retrieve all accounts.
     *
     * @return a list of Account objects
     */
    public List<Account> findAll();

    /**
     * Retrieve all accounts with pagination.
     *
     * @param pageable the pagination information
     * @return a paginated list of Account objects
     */
    public Page<Account> findAllPageable(final Pageable pageable);

    /**
     * Create a new account.
     *
     * @param account the Account object to be created
     * @return a ResponseEntity containing the created Account object
     */
    public Account create(final Account account);

    /**
     * Create multiple accounts.
     *
     * @param accounts a list of Account objects to be created
     * @return a list of created Account objects
     */
    public List<Account> createAll(final List<Account> accounts);
}
