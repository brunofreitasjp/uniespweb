package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos,Integer> {
}
