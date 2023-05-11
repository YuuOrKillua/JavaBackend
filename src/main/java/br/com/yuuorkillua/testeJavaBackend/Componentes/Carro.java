package br.com.yuuorkillua.testeJavaBackend.Componentes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Entity
@Table(name= "carros")
public class Carro extends Veiculo{

    public Carro(@NotBlank String nome, @NotBlank String marca, int ano) {
        super(nome, marca, ano);
    }

    public Carro(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
