package br.com.paulohonfi.postgre.domain.model.mapper;

import br.com.paulohonfi.postgre.app.dto.OffsetDTO;
import br.com.paulohonfi.postgre.domain.model.Offset;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OffsetMapper {

    OffsetDTO toApp(Offset account);
    Offset toDomain(OffsetDTO account);
}
