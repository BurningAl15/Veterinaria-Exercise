package Veterinaria2.Veterinaria.repository;

import Veterinaria2.Veterinaria.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
public interface MascotaRepository  extends JpaRepository<Mascota,Long> {
    List<Mascota> findByTipo(String tipo);
}
