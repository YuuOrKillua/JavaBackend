package br.com.yuuorkillua.testeJavaBackend.Componentes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.yuuorkillua.testeJavaBackend.DTOs.CarroRequestDTO;

@SpringBootTest
public class CarroTest {

    @Test
    void CarroTeste(){
        //dados do carro//
        String nome = "Skyline GTR r34";
        String marca = "Nissan";
        int ano = 1999;

        //criar um carro//
        CarroRequestDTO dadosCarros = new CarroRequestDTO(nome, marca, ano);
        
        //testar se são iguais//
        assertEquals(nome, dadosCarros.getNome());
        assertEquals(marca, dadosCarros.getMarca());
        assertEquals(ano, dadosCarros.getAno());
    }
}