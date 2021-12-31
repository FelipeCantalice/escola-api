package com.felipecantalice.escola.services;

import java.util.List;

import com.felipecantalice.escola.entities.Serie;
import com.felipecantalice.escola.repositories.SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService {
    
    @Autowired
    private SerieRepository serieRepository;

    public List<Serie> listar() {
        return serieRepository.findAll();
    }

    public Serie buscarPorId(Long id) {
        return serieRepository.findById(id).get();
    }

    public Serie salvar(Serie serie) {
        return serieRepository.save(serie);
    }
}
