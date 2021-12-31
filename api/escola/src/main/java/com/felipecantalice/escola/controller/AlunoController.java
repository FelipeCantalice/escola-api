package com.felipecantalice.escola.controller;

import java.util.List;

import com.felipecantalice.escola.entities.Aluno;
import com.felipecantalice.escola.entities.dao.AlunoDao;
import com.felipecantalice.escola.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
 
    @Autowired
    AlunoService alunoService;

    @RequestMapping("/salvar")
    public ResponseEntity<Void> salvar(@RequestBody @Validated AlunoDao aluno) {
        Aluno aluno1 = new Aluno(null, aluno.getNome(), aluno.getEmail(), aluno.getTelefone());
        alunoService.salvar(aluno1);
        return ResponseEntity.status(201).build();
    }

    @RequestMapping("/listar")
    public ResponseEntity<List<Aluno>> listar() {
        List<Aluno> alunos = alunoService.buscarTodos();
        return ResponseEntity.ok(alunos);
    }
}
