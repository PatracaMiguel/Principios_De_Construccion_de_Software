package Biblioteca;
/**
 * Clase que representa a un estudiante como usuario de la biblioteca.
 * Extiende de la clase abstracta Usuario e implementa la interfaz CreadorDeUsuarios.
 * Proporciona funcionalidad específica para estudiantes en el sistema de biblioteca.
 */
public class Estudiante extends Usuario implements CreadorDeUsuarios{

    /**
     * Constructor para crear una instancia de Estudiante.
     * @param id Identificador único del estudiante
     * @param nombre   Nombre completo del estudiante
     * @param email Dirección de correo electrónico del estudiante
     * @param telefono Número de teléfono del estudiante
     */
    public Estudiante(int id, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
    }

    /**
     * Implementación del método de la interfaz CreadorDeUsuarios.
     * Notifica cuando un usuario de tipo estudiante ha sido creado.
     * Muestra un mensaje por consola con el nombre del estudiante creado.
     */
    @Override
    public void usuarioCreado() {
        System.out.println("El usuario estudiante " + getNombre() + " ha sido creado.");
    }
    
}
    

