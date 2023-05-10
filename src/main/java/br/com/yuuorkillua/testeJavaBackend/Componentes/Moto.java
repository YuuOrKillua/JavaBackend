package br.com.yuuorkillua.testeJavaBackend.Componentes;

import jakarta.validation.constraints.NotBlank;

public class Moto extends Veiculo{
    public Moto(@NotBlank String nome, @NotBlank String marca, int ano) {
        super(nome, marca, ano);
    }
    
}
