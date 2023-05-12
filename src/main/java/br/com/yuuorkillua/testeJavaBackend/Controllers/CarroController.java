package br.com.yuuorkillua.testeJavaBackend.Controllers;


import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;
import br.com.yuuorkillua.testeJavaBackend.DTOs.CarroRequestDTO;
import br.com.yuuorkillua.testeJavaBackend.DTOs.CarroResponseDTO;
import br.com.yuuorkillua.testeJavaBackend.Repository.CarroRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = { "/carro" }, produces = { "application/json" })
public class CarroController {
    
    @Autowired
    private CarroRepository carroRepository;

    @Operation(summary = "Cadastra um carro")
    @ApiResponse(responseCode = "201")
    @PostMapping(consumes = { "application/json" })
    public ResponseEntity<CarroResponseDTO> criarCarro(@RequestBody CarroRequestDTO novoCarro) {
        Carro carro = new Carro(novoCarro.getNome(), novoCarro.getMarca(), novoCarro.getAno());
        carroRepository.save(carro);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CarroResponseDTO(carro.getId(), carro.getNome(), carro.getMarca(), carro.getAno()));
    }

    @Operation(summary = "Chamar uma lista de carros")
    @ApiResponse(responseCode = "200", description = "Lista de tipos registrados")
    @GetMapping
    public ResponseEntity<Collection<CarroResponseDTO>> chamarListaDeCarros(@RequestParam(required = false, name = "termo") String nome){
        Iterable<Carro> listaDeCarro;
        if (nome != null) {
            listaDeCarro = carroRepository.findByNome(nome);
        }
        else{
            listaDeCarro = carroRepository.findAll();
        }
        Collection<CarroResponseDTO> carroRetorados =  new ArrayList<>();
        for (Carro carro : listaDeCarro) {
            carroRetorados.add(new CarroResponseDTO(carro.getId(),  carro.getNome(), carro.getMarca(), carro.getAno()));
        }
        return ResponseEntity.ok(carroRetorados);
    }

    @Operation(summary = "Modificar um carro já existente")
    @ApiResponse(responseCode = "200", description = "Retorna os dados atualizados")
    @PutMapping(path = "/{id}", consumes = { "application/json" })
    public ResponseEntity<CarroResponseDTO> modificarCarro(@RequestBody CarroRequestDTO carroRequestDTO, @PathVariable long id){
        Carro carroQueSeraAlterado = carroRepository.findById(id).get();
        carroQueSeraAlterado.setNome(carroRequestDTO.getNome());
        carroQueSeraAlterado.setMarca(carroRequestDTO.getMarca());
        carroQueSeraAlterado.setAno(carroRequestDTO.getAno());
        carroRepository.save(carroQueSeraAlterado);
        return ResponseEntity.ok(new CarroResponseDTO(carroQueSeraAlterado.getId(), carroQueSeraAlterado.getNome(), carroQueSeraAlterado.getMarca(), carroQueSeraAlterado.getAno()));
    }

    @Operation(summary = "Deletar um carro pelo seu id")
    @ApiResponse(responseCode = "204")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deletarCarroPorId(@PathVariable Long id) {
        carroRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
