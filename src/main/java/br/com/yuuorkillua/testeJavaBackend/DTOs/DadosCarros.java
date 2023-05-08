package br.com.yuuorkillua.testeJavaBackend.DTOs;

import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DadosCarros {
    @NonNull
    private String nome;
    @NonNull
    private String marca;
    private int ano;

    public DadosCarros(Carro carro){
        this.nome = getNome();
        this.marca = getMarca();
        this.ano = getAno();
    }
}
