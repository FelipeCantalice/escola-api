package com.felipecantalice.escola.controller;

import java.util.List;

import com.felipecantalice.escola.entities.Serie;
import com.felipecantalice.escola.entities.dao.SerieDao;
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
@RequestMapping("/serie")
public class SerieController {
    
    @Autowired
    private SerieService serieService;

    @GetMapping
    public ResponseEntity<List<Serie>> listar() {
        List<Serie> series = serieService.listar();
        return ResponseEntity.ok(series);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> buscarPorId(@PathVariable Long id) {
        Serie serie = serieService.buscarPorId(id);
        return ResponseEntity.ok(serie);
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody @Validated SerieDao serie) {

        try {
            Serie entity = new Serie(null,serie.getNome());

            serieService.salvar(entity);
        return ResponseEntity.status(201).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        
    }
}
