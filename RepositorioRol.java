package proyecto.Ciclo4.gestionusuarios.repositorios;

import proyecto.Ciclo4.gestionusuarios.modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
