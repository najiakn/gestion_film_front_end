package org.example.gestion_film_front_end.dao;

import org.example.gestion_film_front_end.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmDao  extends JpaRepository<Film , Integer> {

}
