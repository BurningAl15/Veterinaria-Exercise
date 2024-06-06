package Veterinaria2.Veterinaria.service;

import Veterinaria2.Veterinaria.entity.Mascota;
import Veterinaria2.Veterinaria.entity.Veterinaria;
import Veterinaria2.Veterinaria.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinariaService {
    @Autowired
    private VeterinariaRepository veterinariaRepository;
    public Veterinaria registrarVeterinaria(Veterinaria veterinaria){
        return  veterinariaRepository.save(veterinaria);
    }

    public Optional<List<Mascota>> buscarMascotaPorVeterinaria(String nombre){
        return veterinariaRepository.buscarMascotaPorVeterinaria(nombre);
    }
}
