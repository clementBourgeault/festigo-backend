package fr.festigo.backend.service;

import fr.festigo.backend.dto.FestivalDTO;
import fr.festigo.backend.mapper.FestivalMapper;
import fr.festigo.backend.model.FestivalEntity;
import fr.festigo.backend.repository.FestivalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalService {

    private final FestivalRepository festivalRepository;
    private final FestivalMapper festivalMapper;

    public FestivalService(FestivalRepository festivalRepository, FestivalMapper festivalMapper) {
        this.festivalRepository = festivalRepository;
        this.festivalMapper = festivalMapper;
    }

    public List<FestivalDTO> getAllFestivals() {
        return this.festivalRepository.findAll()
                .stream()
                .map(this.festivalMapper::toDTO)
                .toList();
    }

    public FestivalDTO getFestivalById(Long id) {
        FestivalEntity festivalEntity = this.festivalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Festival non trouvé : " + id));
        return this.festivalMapper.toDTO(festivalEntity);
    }

}
