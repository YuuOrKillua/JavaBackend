package br.com.yuuorkillua.testeJavaBackend.Componentes;

import java.util.Iterator;

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
public class Carro extends Veiculo implements Iterable<Carro>{

    public Carro(@NotBlank String nome, @NotBlank String marca, int ano) {
        super(nome, marca, ano);
    }

    public Carro(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Override
    public Iterator<Carro> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
