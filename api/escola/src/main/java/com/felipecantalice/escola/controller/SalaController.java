package com.felipecantalice.escola.controller;

import java.util.List;

import com.felipecantalice.escola.entities.Sala;
import com.felipecantalice.escola.entities.dao.SalaDao;
import com.felipecantalice.escola.services.SalaService;
import com.felipecantalice.escola.services.SerieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sala")
public class SalaController {
    
    @Autowired
    private SalaService salaService;

    @Autowired
    private SerieService serieService;

    @GetMapping
    public ResponseEntity<List<Sala>> listar() {
        List<Sala> salas = salaService.listar();
        return ResponseEntity.ok(salas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sala> buscarPorId(@PathVariable Long id) {
        Sala sala = salaService.buscarPorId(id);
        return ResponseEntity.ok(sala);
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody @Validated SalaDao sala) {

        try {
            Sala entity = new Sala(null,sala.getNumero());

            if(sala.getSalaId() != null) {
                entity.setSerie(serieService.buscarPorId(sala.getSalaId()));
            }

            salaService.salvar(entity);
        return ResponseEntity.status(201).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        
    }
    
}
