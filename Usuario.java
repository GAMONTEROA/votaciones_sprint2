package proyecto.Ciclo4.gestionusuarios.modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()
public class Usuario {
   /* declara id para que este se encargue de traerlo de la base de datos*/
    @Id
    private String _id;
    private String seudonimo;
    private String correo;
    private String contrasena;

    @DBRef

    private Rol rol;
/* excluye ID por que este campo es generado automaticamente por la base de datos, no se usa @constructor para crearlo auttomaticamente porq se quiere excluir el ID */
    public Usuario(String seudonimo, String correo, String contrasena) {
        this.seudonimo = seudonimo;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String get_id() {
        return _id;
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

    public Rol getRol() {return rol;    }

    public void setRol(Rol rol) { this.rol = rol;    }

}