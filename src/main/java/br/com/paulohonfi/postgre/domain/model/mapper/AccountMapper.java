package br.com.paulohonfi.postgre.domain.model.mapper;

import org.mapstruct.Mapper;

import br.com.paulohonfi.postgre.app.dto.AccountDTO;
import br.com.paulohonfi.postgre.domain.model.entity.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountDTO toApp(final Account account);
    Account toDomain(final AccountDTO accountDTO);
}
