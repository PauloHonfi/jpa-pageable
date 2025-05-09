package br.com.paulohonfi.postgre.infra.repository;

import br.com.paulohonfi.postgre.domain.model.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM account")
    Page<Account> findAll(final Pageable pageable);
}
