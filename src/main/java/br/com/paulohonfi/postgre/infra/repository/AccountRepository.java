package br.com.paulohonfi.postgre.infra.repository;

import br.com.paulohonfi.postgre.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    public List<Account> findAll();
}
