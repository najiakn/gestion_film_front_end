package org.example.gestion_film_front_end.service;

import org.example.gestion_film_front_end.dao.FilmDao;
import org.example.gestion_film_front_end.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired

    private FilmDao filmdao;
    @Override
    public List<Film> getAllFilm() {
         return  filmdao.findAll();
     }

    @Override
    public Film getFilmById(int id_film) {
        return filmdao.findById(id_film).orElse(null);
    }

    @Override
    public Film SaveFilm(Film film) {
        return filmdao.save(film);
    }

    @Override
    public void deleteFilm(int id_film) {
        filmdao.deleteById(id_film);
    }

    @Override
    public Film updateFilm(int id_film, Film film) {
        Optional <Film> existinFilm=filmdao.findById(id_film);
        if(existinFilm.isPresent()){  Film updateFilm = existinFilm.get();
            updateFilm.setDate_sortie(film.getDate_sortie());
            updateFilm.setGenre(film.getGenre());
            updateFilm.setNote(film.getNote());
            updateFilm.setRealisateur(film.getRealisateur());

            updateFilm.setTitre(film.getTitre());
          return filmdao.save(updateFilm);

        }
        else
        {
            return null;
        }
    }
       private static Film getFilm(Optional <Film> existingFilm) {
        Film updateFilm=existingFilm.get();
        return updateFilm;

       }
    }

