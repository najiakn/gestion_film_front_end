package org.example.gestion_film_front_end.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto {


    private String titre;
    private Date date_sortie;
    private String genre;
    private String realisateur ;
    private int note;

}
