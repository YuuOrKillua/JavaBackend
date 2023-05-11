package br.com.yuuorkillua.testeJavaBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    Carro findByNome(String nome);
    
}
