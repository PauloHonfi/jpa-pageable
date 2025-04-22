package br.com.paulohonfi.postgre.app.resource;

import br.com.paulohonfi.postgre.app.service.AccountService;
import br.com.paulohonfi.postgre.domain.entity.Account;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/account")
@AllArgsConstructor
public class AccountResource {

    private final AccountService service;

    @GetMapping
    public ResponseEntity<List<Account>> findAll() {
        log.info("Consultando todos os registros de conta");
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/paged")
    public ResponseEntity<Page<Account>> findAll(final Pageable pageable) {
        log.info("Consultando registros de conta com paginação");
        return ResponseEntity.ok().body(service.findAllPageable(pageable));
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody final Account account) {
        log.info("Criando um novo registro de conta");
        return ResponseEntity.ok().body(service.create(account));
    }

    @PostMapping("/all")
    public ResponseEntity<List<Account>> createAll(@RequestBody final List<Account> account) {
        log.info("Criando registro de conta em lote");
        return ResponseEntity.ok().body(service.createAll(account));
    }
}
