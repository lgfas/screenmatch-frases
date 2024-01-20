package br.com.alura.screenmatchfrases.repository;

import br.com.alura.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f from Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Frase buscaFraseAleatoria();
}
