package fr.festigo.backend.dto;

import fr.festigo.backend.enums.StatutFestival;

import java.time.LocalDate;
import java.util.List;

public class FestivalDTO {

    private Long id;

    private String nom;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private String description;

    private String siteWeb;

    private StatutFestival statut;

    private LieuDTO lieu;

    private List<String> artistes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public StatutFestival getStatut() {
        return statut;
    }

    public void setStatut(StatutFestival statut) {
        this.statut = statut;
    }

    public LieuDTO getLieu() {
        return lieu;
    }

    public void setLieu(LieuDTO lieu) {
        this.lieu = lieu;
    }

    public List<String> getArtistes() {
        return artistes;
    }

    public void setArtistes(List<String> artistes) {
        this.artistes = artistes;
    }

}
