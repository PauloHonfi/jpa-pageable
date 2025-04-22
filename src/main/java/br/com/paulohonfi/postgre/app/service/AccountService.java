package br.com.paulohonfi.postgre.app.service;

import br.com.paulohonfi.postgre.app.dto.AccountDTO;
import br.com.paulohonfi.postgre.app.dto.AccountResponseDTO;
import br.com.paulohonfi.postgre.app.dto.OffsetDTO;
import br.com.paulohonfi.postgre.domain.model.mapper.AccountMapper;
import br.com.paulohonfi.postgre.domain.model.mapper.AccountResponseMapper;
import br.com.paulohonfi.postgre.domain.model.mapper.OffsetMapper;
import br.com.paulohonfi.postgre.domain.usecase.AccountUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountUseCase useCase;
    private final AccountResponseMapper mapper;
    private final AccountMapper accountMapper;
    private final OffsetMapper offsetMapper;

    public AccountResponseDTO findAll() {
        return mapper.toApp(useCase.findAll());
    }

    public AccountResponseDTO findAllPageable(final OffsetDTO dto) {
        return mapper.toApp(useCase.findAllPageable(offsetMapper.toDomain(dto)));
    }

    public AccountResponseDTO create(final AccountDTO account) {
        return mapper.toApp(useCase.create(accountMapper.toDomain(account)));
    }

    public AccountResponseDTO createAll(final List<AccountDTO> accounts) {
        return mapper.toApp(useCase.createAll(accounts.stream()
                .map(accountMapper::toDomain)
                .toList()));
    }
}
