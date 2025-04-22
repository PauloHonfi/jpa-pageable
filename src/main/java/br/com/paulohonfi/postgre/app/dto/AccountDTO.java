package br.com.paulohonfi.postgre.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private Long id;
    private String name;
    private String email;
    private BigDecimal balance;
}
