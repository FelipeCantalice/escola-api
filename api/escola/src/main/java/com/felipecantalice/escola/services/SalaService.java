package com.felipecantalice.escola.services;

import java.util.List;

import com.felipecantalice.escola.entities.Sala;
import com.felipecantalice.escola.entities.Serie;
import com.felipecantalice.escola.repositories.SalaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SerieService serieService;

    public List<Sala> listar() {
        return salaRepository.findAll();
    }

    public Sala buscarPorId(Long id) {
        return salaRepository.findById(id).get();
    }

    public Sala salvar(Sala sala) {
        return salaRepository.save(sala);
    }
}