package com.example.poc.domain.dto;

import com.example.poc.domain.enums.Genero;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class PessoaDTO {
    private String idPessoa;
    private String nome;
    private Integer idade;
    private Boolean podeVotar;
    private Genero genero;
}
