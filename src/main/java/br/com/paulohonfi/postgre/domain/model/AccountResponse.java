package br.com.paulohonfi.postgre.domain.model;

import br.com.paulohonfi.postgre.domain.model.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {

    private Warning warning;
    private Pageable pageable;
    private List<Account> content;
}
