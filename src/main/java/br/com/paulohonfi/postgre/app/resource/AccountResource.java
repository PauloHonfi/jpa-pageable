package br.com.paulohonfi.postgre.app.resource;

import br.com.paulohonfi.postgre.app.service.AccountService;
import br.com.paulohonfi.postgre.domain.entity.Account;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody final Account account) {
        log.info("Criando um novo registro de conta");
        return ResponseEntity.ok().body(service.create(account));
    }
}
