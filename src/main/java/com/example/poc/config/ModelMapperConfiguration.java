package com.example.poc.config;

import com.example.poc.domain.dto.PessoaDTO;
import com.example.poc.domain.entity.Pessoa;
import com.example.poc.domain.enums.Genero;
import org.modelmapper.AbstractConverter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.addConverter(new AbstractConverter<Pessoa, PessoaDTO>() {
            @Override
            protected PessoaDTO convert(Pessoa source) {
                PessoaDTO destination = new PessoaDTO();
                destination.setIdPessoa(String.valueOf(source.getId()));
                destination.setNome(source.getNome());
                destination.setIdade(source.getIdade());
                destination.setPodeVotar(source.getIdade() >= 18);
                destination.setGenero(source.getGenero().equals("M")
                    ? Genero.MASCULINO : Genero.FEMININO);

                return destination;
            }
        });

        return modelMapper;
    }
}
