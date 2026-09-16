package fr.festigo.backend.repository;

import fr.festigo.backend.model.FestivalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FestivalRepository extends JpaRepository<FestivalEntity, Long> {
}
