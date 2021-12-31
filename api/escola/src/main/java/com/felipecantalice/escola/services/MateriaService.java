package com.felipecantalice.escola.services;

import java.util.List;
import com.felipecantalice.escola.entities.Materia;
import com.felipecantalice.escola.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {
    
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> listar() {
        return materiaRepository.findAll();
    }

    public Materia buscarPorId(Long id) {
        return materiaRepository.findById(id).get();
    }

    public Materia salvar(Materia materia) {
        return materiaRepository.save(materia);
    }

    public void deletar(Long id) {
        materiaRepository.deleteById(id);
    }

}
