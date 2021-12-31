package com.felipecantalice.escola.services;

import java.util.List;
import com.felipecantalice.escola.entities.Aluno;
import com.felipecantalice.escola.repositories.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void salvar(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void excluir(Aluno aluno) {
        alunoRepository.delete(aluno);
    }

    public List<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }
    
}
