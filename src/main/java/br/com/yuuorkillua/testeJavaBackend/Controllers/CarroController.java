package br.com.yuuorkillua.testeJavaBackend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CarroController {
    
    @RequestMapping("/Carro")
    public String CarroURL() {
        return "Carro";
    }
    
}
