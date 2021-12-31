package com.felipecantalice.escola.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "notas_alunos")
public class NotasAlunos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nota;

    private String atividade;

    private String ano;

    @ManyToOne()
    @JoinColumn(name = "id_sala")
    private Sala sala;

    @ManyToOne()
    @JoinColumn(name = "id_serie")
    private Serie serie;

    @ManyToOne()
    @JoinColumn(name = "id_professor")
    private Professor professor;
    
}