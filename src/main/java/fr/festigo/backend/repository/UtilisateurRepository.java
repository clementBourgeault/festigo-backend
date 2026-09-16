package fr.festigo.backend.repository;

import fr.festigo.backend.model.UtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<UtilisateurEntity, Long> {
}
