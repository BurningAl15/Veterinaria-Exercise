package Veterinaria2.Veterinaria.controller;

import Veterinaria2.Veterinaria.entity.Mascota;
import Veterinaria2.Veterinaria.entity.Veterinaria;
import Veterinaria2.Veterinaria.service.MascotaService;
import Veterinaria2.Veterinaria.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinaria")
public class VeterinariaController {
    @Autowired
    private VeterinariaService veterinariaService;


    @PostMapping
    public ResponseEntity<Veterinaria> registrarVeterinaria(@RequestBody Veterinaria veterinaria){
        return ResponseEntity.ok(veterinariaService.registrarVeterinaria(veterinaria));
    }




    @GetMapping("/buscarPorVeterinaria/{nombre}")
    public ResponseEntity<List<Mascota>> buscarPorVeterinaria(@PathVariable String nombre){
        Optional<List<Mascota>> mascotas= veterinariaService.buscarMascotaPorVeterinaria(nombre);
        if(mascotas.isPresent()){
            //si existe
            return ResponseEntity.ok(mascotas.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
