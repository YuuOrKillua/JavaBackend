package br.com.yuuorkillua.testeJavaBackend.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarroRequestDTO {
    @NotBlank
    private String nome;
    @NotBlank
    private String marca; 
    @NotNull
    private int ano;

    public CarroRequestDTO(String nome, String marca, int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }
}
