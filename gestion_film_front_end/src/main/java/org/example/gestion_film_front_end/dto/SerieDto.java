package org.example.gestion_film_front_end.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SerieDto {
    private  String titre ;
    private Date date_debut;
    private Date date_fin;
    private String genre;
    private String createur;
    int note ;
}
