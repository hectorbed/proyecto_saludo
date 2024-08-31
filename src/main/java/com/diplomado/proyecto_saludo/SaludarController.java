package com.diplomado.proyecto_saludo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SaludarController {

    @GetMapping("/saludar")
    public ResponseEntity<?> saludar(){
        return ResponseEntity.ok().body("Hola, ArgoCD y Helm!");
    }
}
