package br.com.paulohonfi.postgre.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OffsetDTO {

    private int pageNumber;
    private int pageSize;
    private String name;
}
