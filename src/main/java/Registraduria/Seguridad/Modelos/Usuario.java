
package main.java.Registraduria.Seguridad.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class Usuario {
    @Id
    private String cedula;
    private String seudonimo;
    private String correo;
    private String contrasena;

    public Usuario(String seudonimo, String correo,String contraseña) {
        this.seudonimo = seudonimo;
        this.correo =correo;
        this.contrasena = contrasena;

    }

    public String getCedula() {
        return cedula;
    }

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
