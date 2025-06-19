package br.edu.unicesumar.api.repository;

import br.edu.unicesumar.api.entity.Palestrante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalestranteRepository extends JpaRepository<Palestrante, Long> {
}
