package org.example.gestion_film_front_end.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id_serie;
    private  String titre ;
    private  Date date_debut;
    private Date date_fin;
    private String genre;
    private String createur;
    int note ;



}
