package br.com.paulohonfi.postgre.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Offset {

    private int pageNumber;
    private int pageSize;
    private String name;
}
