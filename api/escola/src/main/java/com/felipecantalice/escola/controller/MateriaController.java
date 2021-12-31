package com.felipecantalice.escola.controller;

import java.util.List;

import com.felipecantalice.escola.entities.Materia;
import com.felipecantalice.escola.entities.dao.MateriaDao;
import com.felipecantalice.escola.services.MateriaService;
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
@RequestMapping("/materia")
public class MateriaController {
    
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public ResponseEntity<List<Materia>> listar() {
        List<Materia> materias = materiaService.listar();
        return ResponseEntity.ok(materias);
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody @Validated MateriaDao materia) {

        try {
            Materia entity = new Materia(null,materia.getNome());

            materiaService.salvar(entity);
        return ResponseEntity.status(201).build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> buscarPorId(@PathVariable Long id) {
        Materia materia = materiaService.buscarPorId(id);
        return ResponseEntity.ok(materia);
    }

}
