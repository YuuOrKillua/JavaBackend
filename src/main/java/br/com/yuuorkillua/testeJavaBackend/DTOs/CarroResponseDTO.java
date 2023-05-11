package br.com.yuuorkillua.testeJavaBackend.DTOs;

import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;

public class CarroResponseDTO {
    private long id;
    private String nome;
    private String marca;
    private int ano;
    
    public CarroResponseDTO(long id, String nome,  String marca, int ano){
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }
}
