package com.example.poc;

import com.example.poc.config.ModelMapperConfiguration;
import com.example.poc.domain.dto.PessoaDTO;
import com.example.poc.domain.entity.Pessoa;
import org.modelmapper.ModelMapper;

public class PocMain {
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapperConfiguration().modelMapper();

        Pessoa pessoa = new Pessoa();
        pessoa.setId(1L);
        pessoa.setNome("Jhon doe");
        pessoa.setIdade(19);
        pessoa.setGenero("M");

        PessoaDTO pessoaDTO = modelMapper.map(pessoa, PessoaDTO.class);

        System.out.println(pessoa);
        System.out.println(pessoaDTO);
    }
}
