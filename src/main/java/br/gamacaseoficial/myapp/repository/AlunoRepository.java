package br.gamacaseoficial.myapp.repository;

import br.gamacaseoficial.myapp.domain.Aluno;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Aluno entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
