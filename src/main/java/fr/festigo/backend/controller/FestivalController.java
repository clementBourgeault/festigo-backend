package fr.festigo.backend.controller;

import fr.festigo.backend.dto.FestivalDTO;
import fr.festigo.backend.service.FestivalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/festivals")
public class FestivalController {

    private final FestivalService festivalService;

    public FestivalController(FestivalService festivalService) {
        this.festivalService = festivalService;
    }

    @GetMapping
    public List<FestivalDTO> getAllFestivals() {
        return this.festivalService.getAllFestivals();
    }

    @GetMapping(value = "/{id}")
    public FestivalDTO getFestivalById(@PathVariable Long id) {
        return this.festivalService.getFestivalById(id);
    }
}
