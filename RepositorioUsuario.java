package proyecto.Ciclo4.gestionusuarios.repositorios;

import proyecto.Ciclo4.gestionusuarios.modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioUsuario  extends MongoRepository<Usuario,String> {

    /**?0 se reemplaza por lo q se obtiene del get correo*/
    @Query("{'correo': ?0}")
    public Usuario getUserByEmail(String correo);
}
