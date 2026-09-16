package fr.festigo.backend.model;

import fr.festigo.backend.enums.StatutFestival;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "festival")
public class FestivalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private String description;

    private String siteWeb;

    @Enumerated(EnumType.STRING)
    private StatutFestival statut;

    @ManyToOne
    @JoinColumn(name = "lieu_id")
    private LieuEntity lieu;

    @ManyToMany
    @JoinTable(
            name = "festival_artiste",
            joinColumns = @JoinColumn(name = "festival_id"),
            inverseJoinColumns = @JoinColumn(name = "artiste_id")
    )
    private List<ArtisteEntity> artistes;

    public FestivalEntity() {
    }

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

    public LieuEntity getLieu() {
        return lieu;
    }

    public void setLieu(LieuEntity lieu) {
        this.lieu = lieu;
    }

    public List<ArtisteEntity> getArtistes() {
        return artistes;
    }

    public void setArtistes(List<ArtisteEntity> artistes) {
        this.artistes = artistes;
    }
}
