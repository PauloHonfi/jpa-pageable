package br.com.paulohonfi.postgre.domain.model.mapper;

import br.com.paulohonfi.postgre.app.dto.OffsetDTO;
import br.com.paulohonfi.postgre.domain.model.Offset;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-22T15:29:24-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class OffsetMapperImpl implements OffsetMapper {

    @Override
    public OffsetDTO toApp(Offset account) {
        if ( account == null ) {
            return null;
        }

        OffsetDTO.OffsetDTOBuilder offsetDTO = OffsetDTO.builder();

        offsetDTO.pageNumber( account.getPageNumber() );
        offsetDTO.pageSize( account.getPageSize() );
        offsetDTO.name( account.getName() );

        return offsetDTO.build();
    }

    @Override
    public Offset toDomain(OffsetDTO account) {
        if ( account == null ) {
            return null;
        }

        Offset.OffsetBuilder offset = Offset.builder();

        offset.pageNumber( account.getPageNumber() );
        offset.pageSize( account.getPageSize() );
        offset.name( account.getName() );

        return offset.build();
    }
}
