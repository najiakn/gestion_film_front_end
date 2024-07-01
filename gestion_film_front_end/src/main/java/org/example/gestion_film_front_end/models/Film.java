package org.example.gestion_film_front_end.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
int id_film;
 private String titre;

 private Date date_sortie;
 private String genre;
 private String realisateur ;
 private int note;

}
