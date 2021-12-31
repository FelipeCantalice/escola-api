package com.felipecantalice.escola.entities.dao;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;

@Getter
public class SerieDao {
    
    @Length(min = 3, max = 50)
    private String nome;
}
