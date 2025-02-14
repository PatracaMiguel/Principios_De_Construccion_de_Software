package seleccion;
/**
 * Esta clase sigue la convención de nombrado de Google Java Style Guide (sección 3.4.2),
 * que indica que Los miembros de una clase deben estar ordenados de manera lógica y consistente
 */
public abstract class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Empleado(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void concentrase();
    public abstract void viajar();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
