package br.com.paulohonfi.postgre.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pageable {

    private boolean moreElements;
    private Offset offset;
}
