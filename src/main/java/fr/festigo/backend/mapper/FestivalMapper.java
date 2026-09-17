package fr.festigo.backend.mapper;

import fr.festigo.backend.dto.FestivalDTO;
import fr.festigo.backend.model.ArtisteEntity;
import fr.festigo.backend.model.FestivalEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = LieuMapper.class)
public interface FestivalMapper {

    FestivalDTO toDTO(FestivalEntity festivalEntity);

    default List<String> mapArtistes(List<ArtisteEntity> artistes) {
        return artistes.stream().map(ArtisteEntity::getNom).toList();
    }

}
