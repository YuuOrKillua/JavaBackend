package br.com.yuuorkillua.testeJavaBackend.Componentes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;



public class Carro extends Veiculo{
    public Carro(@NotBlank String nome, @NotBlank String marca, int ano) {
        super(nome, marca, ano);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String dasda;

    public long getId() {
        return id;
    }
}
