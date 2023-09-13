package com.example.poc.domain.entity;

import lombok.Data;

@Data
public class Pessoa {
    private Long id;
    private String nome;
    private Integer idade;
    private String genero;

}
