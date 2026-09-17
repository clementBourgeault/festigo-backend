package fr.festigo.backend.mapper;

import fr.festigo.backend.dto.LieuDTO;
import fr.festigo.backend.model.LieuEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LieuMapper {

    LieuDTO toDTO(LieuEntity lieuEntity);

}
