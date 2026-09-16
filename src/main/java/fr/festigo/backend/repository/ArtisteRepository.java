package fr.festigo.backend.repository;

import fr.festigo.backend.model.ArtisteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtisteRepository extends JpaRepository<ArtisteEntity, Long> {
}
