package br.com.yuuorkillua.testeJavaBackend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {
    
    @GetMapping
    public String CarroUrl () {
        return "Carro";
    }
    
}
