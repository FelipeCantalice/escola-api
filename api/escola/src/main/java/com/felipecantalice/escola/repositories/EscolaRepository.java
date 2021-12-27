package com.felipecantalice.escola.repositories;

import com.felipecantalice.escola.entities.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {

}
    
