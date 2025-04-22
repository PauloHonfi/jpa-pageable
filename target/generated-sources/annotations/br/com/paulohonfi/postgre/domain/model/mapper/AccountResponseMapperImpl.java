package br.com.paulohonfi.postgre.domain.model.mapper;

import br.com.paulohonfi.postgre.app.dto.AccountDTO;
import br.com.paulohonfi.postgre.app.dto.AccountResponseDTO;
import br.com.paulohonfi.postgre.app.dto.OffsetDTO;
import br.com.paulohonfi.postgre.app.dto.PageableDTO;
import br.com.paulohonfi.postgre.app.dto.WarningDTO;
import br.com.paulohonfi.postgre.domain.model.AccountResponse;
import br.com.paulohonfi.postgre.domain.model.Offset;
import br.com.paulohonfi.postgre.domain.model.Pageable;
import br.com.paulohonfi.postgre.domain.model.Warning;
import br.com.paulohonfi.postgre.domain.model.entity.Account;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-22T15:29:24-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class AccountResponseMapperImpl implements AccountResponseMapper {

    @Override
    public AccountResponseDTO toApp(AccountResponse account) {
        if ( account == null ) {
            return null;
        }

        AccountResponseDTO.AccountResponseDTOBuilder accountResponseDTO = AccountResponseDTO.builder();

        accountResponseDTO.warning( warningToWarningDTO( account.getWarning() ) );
        accountResponseDTO.pageable( pageableToPageableDTO( account.getPageable() ) );
        accountResponseDTO.content( accountListToAccountDTOList( account.getContent() ) );

        return accountResponseDTO.build();
    }

    protected WarningDTO warningToWarningDTO(Warning warning) {
        if ( warning == null ) {
            return null;
        }

        WarningDTO.WarningDTOBuilder warningDTO = WarningDTO.builder();

        warningDTO.message( warning.getMessage() );
        warningDTO.code( warning.getCode() );

        return warningDTO.build();
    }

    protected OffsetDTO offsetToOffsetDTO(Offset offset) {
        if ( offset == null ) {
            return null;
        }

        OffsetDTO.OffsetDTOBuilder offsetDTO = OffsetDTO.builder();

        offsetDTO.pageNumber( offset.getPageNumber() );
        offsetDTO.pageSize( offset.getPageSize() );
        offsetDTO.name( offset.getName() );

        return offsetDTO.build();
    }

    protected PageableDTO pageableToPageableDTO(Pageable pageable) {
        if ( pageable == null ) {
            return null;
        }

        PageableDTO.PageableDTOBuilder pageableDTO = PageableDTO.builder();

        pageableDTO.moreElements( pageable.isMoreElements() );
        pageableDTO.offset( offsetToOffsetDTO( pageable.getOffset() ) );

        return pageableDTO.build();
    }

    protected AccountDTO accountToAccountDTO(Account account) {
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

    protected List<AccountDTO> accountListToAccountDTOList(List<Account> list) {
        if ( list == null ) {
            return null;
        }

        List<AccountDTO> list1 = new ArrayList<AccountDTO>( list.size() );
        for ( Account account : list ) {
            list1.add( accountToAccountDTO( account ) );
        }

        return list1;
    }
}
