package br.com.yuuorkillua.testeJavaBackend.DTOs;

import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DadosCarros {
    @NotBlank
    private String nome;
    @NotBlank
    private String marca;
    private int ano;

    public DadosCarros(Carro carro){
        this.nome = getNome();
        this.marca = getMarca();
        this.ano = getAno();
    }
}
