package br.com.paulohonfi.postgre.infra.dataprovider.impl;

import br.com.paulohonfi.postgre.domain.model.AccountResponse;
import br.com.paulohonfi.postgre.domain.model.Offset;
import br.com.paulohonfi.postgre.domain.model.Pageable;
import br.com.paulohonfi.postgre.domain.model.Warning;
import br.com.paulohonfi.postgre.domain.model.entity.Account;
import br.com.paulohonfi.postgre.infra.dataprovider.AccountDataProvider;
import br.com.paulohonfi.postgre.infra.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class AccountDataProviderImpl implements AccountDataProvider {

    private final AccountRepository repository;

    @Override
    public AccountResponse findAll() {
        log.info("Recuperando todos os registros de conta do banco");
        final List<Account> accounts = repository.findAll();

        AccountResponse response = null;
        if (accounts != null && !accounts.isEmpty()) {
            log.info("Registros de conta recuperados com sucesso");
            response = AccountResponse.builder()
                    .pageable(Pageable.builder().moreElements(Boolean.FALSE).build())
                    .warning(Warning.builder().code("SUCCESS").message(getWarningMessage(null)).build())
                    .content(accounts)
                    .build();
        }
        return response;
    }

    @Override
    public AccountResponse findAllPageable(final Offset offset) {
        log.info("Recuperando registros de conta do banco com paginação");
        final Page<Account> accounts = repository.findAll(PageRequest.of(offset.getPageNumber(), offset.getPageSize()));

        AccountResponse response = null;
        if (accounts != null && !accounts.isEmpty()) {
            log.info("Registros de conta com paginação recuperados com sucesso");

            response = AccountResponse.builder()
                    .warning(Warning.builder().code("SUCCESS")
                            .message(getWarningMessage(accounts)).build())
                    .pageable(Pageable.builder().moreElements(isMoreElements(accounts))
                            .offset(getOffset(accounts)).build())
                    .content(accounts.getContent())
                    .build();
        }
        return response;
    }

    @Override
    public AccountResponse create(final Account account) {
        log.info("Criando um novo registro de conta no banco");
        return AccountResponse.builder()
                .warning(Warning.builder().code("SUCCESS")
                        .message(getWarningMessage(null)).build())
                .pageable(Pageable.builder().moreElements(isMoreElements(null))
                        .offset(getOffset(null)).build())
                .content(List.of(repository.save(account)))
                .build();
    }

    @Override
    public AccountResponse createAll(List<Account> accounts) {
        log.info("Criando registros de conta em lote no banco");
        return AccountResponse.builder()
                .warning(Warning.builder().code("SUCCESS")
                        .message(getWarningMessage(null)).build())
                .pageable(Pageable.builder().moreElements(isMoreElements(null))
                        .offset(getOffset(null)).build())
                .content(repository.saveAll(accounts))
                .build();
    }

    private boolean isMoreElements(final Page<Account> page) {
        boolean moreElements = false;
        if (page != null && page.hasContent()) {
            moreElements = page.getTotalPages() > page.getNumber() + 1;
        }
        return moreElements;
    }

    private String getWarningMessage(final Page<Account> accounts) {
        String message = "No more elements";
        if (isMoreElements(accounts)) {
            message = "There are more elements";
        }
        return message;
    }

    private Offset getOffset(final Page<Account> accounts) {
        Offset offset = null;
        if(isMoreElements(accounts)) {
             offset = Offset.builder()
                    .pageNumber(accounts.getNumber() +1)
                    .pageSize(accounts.getSize())
                    .build();
        }
        return offset;
    }
}
