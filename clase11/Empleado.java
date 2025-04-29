package clase11;

/**
 * Clase que representa un Empleado con nombre, profesión y empresa asociada.
 */
public class Empleado {

    // Atributos privados del empleado
    private String nombre;
    private String profesion; // Nota: corregido el nombre de "profecion" a "profesion"
    private String empresa;

    // Métodos getter y setter para 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para 'profesion'
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Métodos getter y setter para 'empresa'
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
