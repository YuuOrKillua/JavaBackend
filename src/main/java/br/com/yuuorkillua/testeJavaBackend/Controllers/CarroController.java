package br.com.yuuorkillua.testeJavaBackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yuuorkillua.testeJavaBackend.Componentes.Carro;
import br.com.yuuorkillua.testeJavaBackend.DTOs.CarroRequestDTO;
import br.com.yuuorkillua.testeJavaBackend.DTOs.CarroResponseDTO;
import br.com.yuuorkillua.testeJavaBackend.Repository.CarroRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = { "/carro" } )
public class CarroController {
    
    @Autowired
    private CarroRepository carroRepository;

    @Operation(summary = "cadastra um carro")
    @ApiResponse(responseCode = "201")
    @PostMapping
    public ResponseEntity<CarroResponseDTO> criartTipo(@RequestBody CarroRequestDTO novoCarro) {
        Carro carro = new Carro(novoCarro.getNome(), novoCarro.getMarca(), novoCarro.getAno());
        carroRepository.save(carro);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CarroResponseDTO(carro.getId(), carro.getNome(), carro.getMarca(), carro.getAno()));
    }

}
