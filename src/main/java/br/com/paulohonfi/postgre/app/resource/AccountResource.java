package br.com.paulohonfi.postgre.app.resource;

import br.com.paulohonfi.postgre.app.dto.AccountDTO;
import br.com.paulohonfi.postgre.app.dto.AccountResponseDTO;
import br.com.paulohonfi.postgre.app.dto.OffsetDTO;
import br.com.paulohonfi.postgre.app.service.AccountService;
import br.com.paulohonfi.postgre.domain.model.entity.Account;
import br.com.paulohonfi.postgre.domain.model.mapper.AccountMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountResource {

    private final AccountService service;

    @GetMapping
    public ResponseEntity<AccountResponseDTO> findAll() {
        log.info("Consultando todos os registros de conta");
        return ResponseEntity.ok().body(service.findAll());
    }

    @PostMapping("/paged")
    public ResponseEntity<AccountResponseDTO> findAll(@RequestBody final OffsetDTO dto) {
        log.info("Consultando registros de conta com paginação");
        return ResponseEntity.ok().body(service.findAllPageable(dto));
    }

    @PostMapping
    public ResponseEntity<AccountResponseDTO> create(@RequestBody final AccountDTO account) {
        log.info("Criando um novo registro de conta");
        return ResponseEntity.ok().body(service.create(account));
    }

    @PostMapping("/all")
    public ResponseEntity<AccountResponseDTO> createAll(@RequestBody final List<AccountDTO> accounts) {
        log.info("Criando registro de conta em lote");
        return ResponseEntity.ok().body(service.createAll(accounts));
    }
}
