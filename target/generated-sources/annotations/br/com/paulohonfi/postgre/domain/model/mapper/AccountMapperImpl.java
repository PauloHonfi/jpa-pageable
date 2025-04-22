package br.com.paulohonfi.postgre.domain.model.mapper;

import br.com.paulohonfi.postgre.app.dto.AccountDTO;
import br.com.paulohonfi.postgre.domain.model.entity.Account;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-22T15:29:23-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDTO toApp(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDTO.AccountDTOBuilder accountDTO = AccountDTO.builder();

        accountDTO.id( account.getId() );
        accountDTO.name( account.getName() );
        accountDTO.email( account.getEmail() );
        accountDTO.balance( account.getBalance() );

        return accountDTO.build();
    }

    @Override
    public Account toDomain(AccountDTO accountDTO) {
        if ( accountDTO == null ) {
            return null;
        }

        Account.AccountBuilder account = Account.builder();

        account.id( accountDTO.getId() );
        account.name( accountDTO.getName() );
        account.email( accountDTO.getEmail() );
        account.balance( accountDTO.getBalance() );

        return account.build();
    }
}
