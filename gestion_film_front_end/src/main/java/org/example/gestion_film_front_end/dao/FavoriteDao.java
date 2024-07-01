package org.example.gestion_film_front_end.dao;

import org.example.gestion_film_front_end.models.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteDao extends JpaRepository<Favorite,Integer> {
}
