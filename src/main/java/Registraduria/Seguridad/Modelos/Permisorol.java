package Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Permisorol{
    @Id
    private String id_permisorol;
    @DBRef
    private Rol id_rol;
    @DBRef
    private Permiso id_permiso;
    public Permisorol() {

    }
