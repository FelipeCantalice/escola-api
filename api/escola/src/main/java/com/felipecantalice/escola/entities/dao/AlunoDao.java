package com.felipecantalice.escola.entities.dao;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;

@Getter
public class AlunoDao {
 
    @Length(min = 3, max = 50)
    private String nome;

    @Email
    private String email;

    @Length(min = 3, max = 12)
    private String telefone;
}
