package Veterinaria2.Veterinaria.controller;

import Veterinaria2.Veterinaria.entity.Mascota;
import Veterinaria2.Veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @PostMapping
    public ResponseEntity<Mascota> registrarMascota(@RequestBody Mascota mascota){
        return ResponseEntity.ok(mascotaService.registrarMascota(mascota));
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Mascota>> buscarPorTipo(@PathVariable String tipo){
        return ResponseEntity.ok(mascotaService.buscarTipo(tipo));
    }
}
