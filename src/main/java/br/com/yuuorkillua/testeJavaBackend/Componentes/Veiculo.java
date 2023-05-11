package br.com.yuuorkillua.testeJavaBackend.Componentes;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class Veiculo {
    @NotBlank
    private String nome;
    @NotBlank
    private String marca;
    private int ano;
    
    public Veiculo(@NotBlank String nome, @NotBlank String marca, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    
}
