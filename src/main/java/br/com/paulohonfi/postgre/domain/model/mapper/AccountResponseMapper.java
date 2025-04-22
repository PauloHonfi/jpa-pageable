package br.com.paulohonfi.postgre.domain.model.mapper;

import br.com.paulohonfi.postgre.app.dto.AccountResponseDTO;
import br.com.paulohonfi.postgre.domain.model.AccountResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountResponseMapper {

        AccountResponseDTO toApp(AccountResponse account);
}
