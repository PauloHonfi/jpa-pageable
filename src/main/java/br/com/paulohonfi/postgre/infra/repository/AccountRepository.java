package br.com.paulohonfi.postgre.infra.repository;

import br.com.paulohonfi.postgre.domain.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
