package Registraduria.Seguridad.Repositorios;
import Registraduria.Seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
