package br.com.yuuorkillua.testeJavaBackend.Componentes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Carro extends Veiculo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public Carro(String nome,  String marca,  int ano) {
        setNome(getNome());  
        setMarca(getMarca());
        setAno(getAno());
    }
}
