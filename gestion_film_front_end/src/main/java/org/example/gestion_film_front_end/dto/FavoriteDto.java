package org.example.gestion_film_front_end.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.gestion_film_front_end.models.Film;
import org.example.gestion_film_front_end.models.Serie;


public class FavoriteDto {
    @ManyToOne
    @JoinColumn(name = "id_film")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "id_serie")
    private Serie serie;
}
