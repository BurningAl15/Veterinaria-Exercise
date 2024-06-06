package Veterinaria2.Veterinaria.repository;

import Veterinaria2.Veterinaria.entity.Mascota;
import Veterinaria2.Veterinaria.entity.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
public interface VeterinariaRepository  extends JpaRepository<Veterinaria,Long> {
    //consulta 100% hql
    @Query("SELECT v FROM Veterinaria v where v.nombre=?1")
    Optional<List<Mascota>> buscarMascotaPorVeterinaria(String nombre);
}
