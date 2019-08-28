package libretadedirecciones;

public class coleccioncontactos {
    public String nombre,direccion,celular,correo;

    public coleccioncontactos(String nombre, String direccion, String celular, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }
     
}
