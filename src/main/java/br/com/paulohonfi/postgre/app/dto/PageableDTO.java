package br.com.paulohonfi.postgre.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageableDTO {

    private boolean moreElements;
    private OffsetDTO offset;
}
