package fr.festigo.backend.config;

import fr.festigo.backend.enums.StatutFestival;
import fr.festigo.backend.model.ArtisteEntity;
import fr.festigo.backend.model.FestivalEntity;
import fr.festigo.backend.model.LieuEntity;
import fr.festigo.backend.repository.ArtisteRepository;
import fr.festigo.backend.repository.FestivalRepository;
import fr.festigo.backend.repository.LieuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ArtisteRepository artisteRepository;
    private final FestivalRepository festivalRepository;
    private final LieuRepository lieuRepository;

    public DataInitializer(ArtisteRepository artisteRepository, FestivalRepository festivalRepository, LieuRepository lieuRepository) {
        this.artisteRepository = artisteRepository;
        this.festivalRepository = festivalRepository;
        this.lieuRepository = lieuRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // --- ARTISTES (créés une seule fois, réutilisés entre festivals) ---
        ArtisteEntity artisteIndochine = artisteRepository.save(creerArtiste("Indochine"));
        ArtisteEntity artisteLinkinPark = artisteRepository.save(creerArtiste("Linkin Park"));
        ArtisteEntity artisteGims = artisteRepository.save(creerArtiste("Gims"));
        ArtisteEntity artisteMetallica = artisteRepository.save(creerArtiste("Metallica"));
        ArtisteEntity artisteSystemOfADown = artisteRepository.save(creerArtiste("System of a Down"));
        ArtisteEntity artisteAngele = artisteRepository.save(creerArtiste("Angèle"));
        ArtisteEntity artisteStromae = artisteRepository.save(creerArtiste("Stromae"));
        ArtisteEntity artisteOrelsan = artisteRepository.save(creerArtiste("Orelsan"));
        ArtisteEntity artisteAyaNakamura = artisteRepository.save(creerArtiste("Aya Nakamura"));
        ArtisteEntity artisteJustice = artisteRepository.save(creerArtiste("Justice"));
        ArtisteEntity artisteChemicalBrothers = artisteRepository.save(creerArtiste("The Chemical Brothers"));
        ArtisteEntity artisteMuse = artisteRepository.save(creerArtiste("Muse"));
        ArtisteEntity artisteBooba = artisteRepository.save(creerArtiste("Booba"));
        ArtisteEntity artisteVianney = artisteRepository.save(creerArtiste("Vianney"));
        ArtisteEntity artisteClaraLuciani = artisteRepository.save(creerArtiste("Clara Luciani"));

        // --- FESTIVAL 1 : Vieilles Charrues ---
        LieuEntity lieuCarhaix = lieuRepository.save(
                creerLieu("La prairie de Kerampuilh", "Carhaix-Plouguer", "Finistère", 48.2709, -3.5507));
        festivalRepository.save(creerFestival(
                "Les Vieilles Charrues",
                LocalDate.of(2026, 7, 16), LocalDate.of(2026, 7, 19),
                "Un des plus grands festivals de musique en France.",
                "https://www.vieillescharrues.asso.fr",
                lieuCarhaix,
                List.of(artisteIndochine, artisteLinkinPark, artisteGims)));

        // --- FESTIVAL 2 : Hellfest ---
        LieuEntity lieuClisson = lieuRepository.save(
                creerLieu("Le Val de Moine", "Clisson", "Loire-Atlantique", 47.0879, -1.2857));
        festivalRepository.save(creerFestival(
                "Hellfest",
                LocalDate.of(2026, 6, 18), LocalDate.of(2026, 6, 21),
                "Le grand rendez-vous européen du metal et du rock.",
                "https://www.hellfest.fr",
                lieuClisson,
                List.of(artisteMetallica, artisteSystemOfADown, artisteLinkinPark)));

        // --- FESTIVAL 3 : Rock en Seine ---
        LieuEntity lieuSaintCloud = lieuRepository.save(
                creerLieu("Domaine national de Saint-Cloud", "Saint-Cloud", "Hauts-de-Seine", 48.8422, 2.2153));
        festivalRepository.save(creerFestival(
                "Rock en Seine",
                LocalDate.of(2026, 8, 21), LocalDate.of(2026, 8, 23),
                "Festival de rock et musiques actuelles aux portes de Paris.",
                "https://www.rockenseine.com",
                lieuSaintCloud,
                List.of(artisteMuse, artisteAngele)));

        // --- FESTIVAL 4 : Solidays ---
        LieuEntity lieuParisLongchamp = lieuRepository.save(
                creerLieu("Hippodrome de Longchamp", "Paris", "Paris", 48.8566, 2.2412));
        festivalRepository.save(creerFestival(
                "Solidays",
                LocalDate.of(2026, 6, 26), LocalDate.of(2026, 6, 28),
                "Festival musical au profit de la lutte contre le sida.",
                "https://www.solidays.org",
                lieuParisLongchamp,
                List.of(artisteGims, artisteAyaNakamura, artisteStromae)));

        // --- FESTIVAL 5 : Main Square ---
        LieuEntity lieuArras = lieuRepository.save(
                creerLieu("Citadelle d'Arras", "Arras", "Pas-de-Calais", 50.2972, 2.7765));
        festivalRepository.save(creerFestival(
                "Main Square Festival",
                LocalDate.of(2026, 7, 3), LocalDate.of(2026, 7, 5),
                "Festival pop-rock dans le cadre historique de la citadelle d'Arras.",
                "https://www.mainsquarefestival.fr",
                lieuArras,
                List.of(artisteOrelsan, artisteBooba)));

        // --- FESTIVAL 6 : Garorock ---
        LieuEntity lieuMarmande = lieuRepository.save(
                creerLieu("Parc des expositions", "Marmande", "Lot-et-Garonne", 44.5000, 0.1667));
        festivalRepository.save(creerFestival(
                "Garorock",
                LocalDate.of(2026, 6, 24), LocalDate.of(2026, 6, 27),
                "Festival éclectique mêlant rock, rap et électro.",
                "https://www.garorock.com",
                lieuMarmande,
                List.of(artisteOrelsan, artisteAngele)));

        // --- FESTIVAL 7 : Cabaret Vert ---
        LieuEntity lieuCharleville = lieuRepository.save(
                creerLieu("Prairie de Sedan", "Charleville-Mézières", "Ardennes", 49.7728, 4.7196));
        festivalRepository.save(creerFestival(
                "Cabaret Vert",
                LocalDate.of(2026, 8, 20), LocalDate.of(2026, 8, 23),
                "Festival musical et écoresponsable dans les Ardennes.",
                "https://www.cabaretvert.com",
                lieuCharleville,
                List.of(artisteStromae, artisteMetallica)));

        // --- FESTIVAL 8 : Beauregard ---
        LieuEntity lieuHerouville = lieuRepository.save(
                creerLieu("Château de Beauregard", "Hérouville-Saint-Clair", "Calvados", 49.2003, -0.3308));
        festivalRepository.save(creerFestival(
                "Beauregard",
                LocalDate.of(2026, 7, 3), LocalDate.of(2026, 7, 5),
                "Festival pop-rock dans le parc du château de Beauregard.",
                "https://www.beauregardfestival.com",
                lieuHerouville,
                List.of(artisteMuse, artisteJustice)));

        // --- FESTIVAL 9 : Francofolies ---
        LieuEntity lieuLaRochelle = lieuRepository.save(
                creerLieu("Vieux Port", "La Rochelle", "Charente-Maritime", 46.1591, -1.1520));
        festivalRepository.save(creerFestival(
                "Francofolies de La Rochelle",
                LocalDate.of(2026, 7, 13), LocalDate.of(2026, 7, 17),
                "Le grand rendez-vous de la chanson francophone.",
                "https://www.francofolies.fr",
                lieuLaRochelle,
                List.of(artisteIndochine, artisteVianney, artisteClaraLuciani)));

        // --- FESTIVAL 10 : Astropolis ---
        LieuEntity lieuBrest = lieuRepository.save(
                creerLieu("Site des Capucins", "Brest", "Finistère", 48.3904, -4.4861));
        festivalRepository.save(creerFestival(
                "Astropolis",
                LocalDate.of(2026, 8, 5), LocalDate.of(2026, 8, 9),
                "Festival de musiques électroniques breton, référence du genre en France.",
                "https://www.astropolis.org",
                lieuBrest,
                List.of(artisteJustice, artisteChemicalBrothers)));

        // --- FESTIVAL 11 : Papillons de Nuit ---
        LieuEntity lieuSaintGeorges = lieuRepository.save(
                creerLieu("Site des Papillons de Nuit", "Saint-Georges-de-Reneins", "Rhône", 46.0667, 4.7667));
        festivalRepository.save(creerFestival(
                "Papillons de Nuit",
                LocalDate.of(2026, 7, 22), LocalDate.of(2026, 7, 25),
                "Festival généraliste convivial dans le Beaujolais.",
                "https://www.papillonsdenuit.com",
                lieuSaintGeorges,
                List.of(artisteGims, artisteOrelsan)));

        // --- FESTIVAL 12 : Musilac ---
        LieuEntity lieuAixLesBains = lieuRepository.save(
                creerLieu("Plage mémorial", "Aix-les-Bains", "Savoie", 45.6886, 5.9153));
        festivalRepository.save(creerFestival(
                "Musilac",
                LocalDate.of(2026, 7, 9), LocalDate.of(2026, 7, 11),
                "Festival musical au bord du lac du Bourget.",
                "https://www.musilac.com",
                lieuAixLesBains,
                List.of(artisteAngele, artisteStromae)));

        // --- FESTIVAL 13 : Nuits Sonores ---
        LieuEntity lieuLyon = lieuRepository.save(
                creerLieu("Les Docks / Sucrière", "Lyon", "Rhône", 45.7640, 4.8357));
        festivalRepository.save(creerFestival(
                "Nuits Sonores",
                LocalDate.of(2026, 5, 20), LocalDate.of(2026, 5, 24),
                "Festival de musiques électroniques et arts numériques.",
                "https://www.nuits-sonores.com",
                lieuLyon,
                List.of(artisteChemicalBrothers, artisteJustice)));

        // --- FESTIVAL 14 : Printemps de Bourges ---
        LieuEntity lieuBourges = lieuRepository.save(
                creerLieu("Centre-ville", "Bourges", "Cher", 47.0810, 2.3988));
        festivalRepository.save(creerFestival(
                "Le Printemps de Bourges",
                LocalDate.of(2026, 4, 21), LocalDate.of(2026, 4, 26),
                "Festival historique dédié aux nouveaux talents et à la chanson française.",
                "https://www.printemps-bourges.com",
                lieuBourges,
                List.of(artisteVianney, artisteClaraLuciani)));

        // --- FESTIVAL 15 : We Love Green ---
        LieuEntity lieuVincennes = lieuRepository.save(
                creerLieu("Bois de Vincennes", "Paris", "Paris", 48.8300, 2.4400));
        festivalRepository.save(creerFestival(
                "We Love Green",
                LocalDate.of(2026, 6, 5), LocalDate.of(2026, 6, 7),
                "Festival écoresponsable mêlant musique et engagement environnemental.",
                "https://www.welovegreen.fr",
                lieuVincennes,
                List.of(artisteAyaNakamura, artisteChemicalBrothers)));
    }

    private LieuEntity creerLieu(String nom, String ville, String departement, Double latitude, Double longitude) {
        LieuEntity newLieu = new LieuEntity();
        newLieu.setNom(nom);
        newLieu.setVille(ville);
        newLieu.setDepartement(departement);
        newLieu.setLatitude(latitude);
        newLieu.setLongitude(longitude);
        return newLieu;
    }

    private ArtisteEntity creerArtiste(String nom) {
        ArtisteEntity newArtiste = new ArtisteEntity();
        newArtiste.setNom(nom);
        return newArtiste;
    }

    private FestivalEntity creerFestival(String nom, LocalDate dateDebut, LocalDate dateFin, String description, String siteWeb, LieuEntity lieu, List<ArtisteEntity> artistes) {
        FestivalEntity newFestival = new FestivalEntity();
        newFestival.setNom(nom);
        newFestival.setDateDebut(dateDebut);
        newFestival.setDateFin(dateFin);
        newFestival.setDescription(description);
        newFestival.setSiteWeb(siteWeb);
        newFestival.setLieu(lieu);
        newFestival.setArtistes(artistes);
        newFestival.setStatut(StatutFestival.VALIDE);
        return newFestival;
    }
}
