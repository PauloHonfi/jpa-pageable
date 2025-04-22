package br.com.paulohonfi.postgre.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDTO {

    private WarningDTO warning;
    private PageableDTO pageable;
    private List<AccountDTO> content;
}
