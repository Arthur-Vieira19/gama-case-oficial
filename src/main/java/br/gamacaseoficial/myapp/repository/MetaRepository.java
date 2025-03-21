package br.gamacaseoficial.myapp.repository;

import br.gamacaseoficial.myapp.domain.Meta;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Meta entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MetaRepository extends JpaRepository<Meta, Long> {}
