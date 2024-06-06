package Veterinaria2.Veterinaria.service;

import Veterinaria2.Veterinaria.entity.Mascota;
import Veterinaria2.Veterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;

    public Mascota registrarMascota(Mascota mascota){
        return  mascotaRepository.save(mascota);
    }

    public List<Mascota> buscarTipo(String tipo){
        return mascotaRepository.findByTipo(tipo);
    }
}
