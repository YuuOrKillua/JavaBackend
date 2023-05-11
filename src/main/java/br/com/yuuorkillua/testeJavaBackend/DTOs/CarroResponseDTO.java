package br.com.yuuorkillua.testeJavaBackend.DTOs;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CarroResponseDTO {
    private long id;
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    private String marca;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private int ano;
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public CarroResponseDTO(long id, String nome,  String marca, int ano){
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }
}
