package fr.festigo.backend.repository;

import fr.festigo.backend.model.LieuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LieuRepository extends JpaRepository<LieuEntity, Long> {
}
