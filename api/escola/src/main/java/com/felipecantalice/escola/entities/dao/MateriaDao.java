package com.felipecantalice.escola.entities.dao;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;

@Getter
public class MateriaDao {
    
    @Length(min = 5, max = 50)
    @NotNull
    private String nome;

}
