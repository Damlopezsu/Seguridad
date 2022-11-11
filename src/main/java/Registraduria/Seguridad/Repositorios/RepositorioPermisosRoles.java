package Registraduria.Seguridad.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import Registraduria.Seguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}