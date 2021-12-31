package com.felipecantalice.escola.entities.dao;

import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class SalaDao {
    
    @NotNull
    private String numero;

    private Long salaId;
}
