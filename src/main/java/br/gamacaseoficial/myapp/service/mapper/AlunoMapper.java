package br.gamacaseoficial.myapp.service.mapper;

import br.gamacaseoficial.myapp.domain.Aluno;
import br.gamacaseoficial.myapp.service.dto.AlunoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Aluno} and its DTO {@link AlunoDTO}.
 */
@Mapper(componentModel = "spring")
public interface AlunoMapper extends EntityMapper<AlunoDTO, Aluno> {}
