package com.felipecantalice.escola.repositories;

import com.felipecantalice.escola.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
    
