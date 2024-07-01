package org.example.gestion_film_front_end.service;

import org.example.gestion_film_front_end.models.Film;

import java.util.List;

public interface FilmService {
    List<Film> getAllFilm();
    Film getFilmById(int id_film);
    Film SaveFilm(Film film);
    void deleteFilm (int id_film);
    Film updateFilm(int id , Film film);

}
