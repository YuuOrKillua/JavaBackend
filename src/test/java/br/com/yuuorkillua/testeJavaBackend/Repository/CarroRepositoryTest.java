package br.com.yuuorkillua.testeJavaBackend.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;

@SpringBootTest
public class CarroRepositoryTest {
    
    @Autowired
    private CarroRepository carroRepository;

    @BeforeEach
    @AfterEach
    void setUp() {
        carroRepository.deleteAll();
    }

    @Test
    void saveMethod(){
        //criar um carro novo//
        Carro carro = new Carro("Supra A80", "Toyota", 1993);
        //salvar este carro//
        Carro carroSalvo = carroRepository.save(carro);
        //mostra o carro salvo//
        assertEquals(carro.getNome(), carroSalvo.getNome());
        assertEquals(carro.getAno(), carroSalvo.getAno());
        assertEquals(carro.getMarca(), carroSalvo.getMarca());
    }
    
}
