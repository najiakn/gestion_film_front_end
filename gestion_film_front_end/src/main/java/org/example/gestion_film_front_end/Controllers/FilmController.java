package org.example.gestion_film_front_end.Controllers;

import org.example.gestion_film_front_end.models.Film;
import org.example.gestion_film_front_end.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/film")

public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping
    public List<Film>getAllFilm(){
        return filmService.getAllFilm();

    }
    @GetMapping("/{id_film}")
    public Film getFilmById(@PathVariable int id_film){
        return  filmService.getFilmById(id_film);
}

    @PostMapping
    public Film SaveFilm(@RequestBody Film film){
        return filmService.SaveFilm(film);
    }

    @DeleteMapping("/{id_film}")
    public void deleteFilm(@PathVariable int id_film ){
         filmService.deleteFilm(id_film);
    }

    @PutMapping("/{id_film}")

    public Film updateFilm(@PathVariable int id_film, @RequestBody Film film){
        return filmService.updateFilm(id_film,film);
    }
}

