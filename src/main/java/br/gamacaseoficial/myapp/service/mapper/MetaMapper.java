package br.gamacaseoficial.myapp.service.mapper;

import br.gamacaseoficial.myapp.domain.Aluno;
import br.gamacaseoficial.myapp.domain.Meta;
import br.gamacaseoficial.myapp.service.dto.AlunoDTO;
import br.gamacaseoficial.myapp.service.dto.MetaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Meta} and its DTO {@link MetaDTO}.
 */
@Mapper(componentModel = "spring")
public interface MetaMapper extends EntityMapper<MetaDTO, Meta> {
    @Mapping(target = "aluno", source = "aluno", qualifiedByName = "alunoId")
    MetaDTO toDto(Meta s);

    @Named("alunoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AlunoDTO toDtoAlunoId(Aluno aluno);
}
