package Biblioteca;

/**
 * Clase que representa a un profesor como usuario de la biblioteca.
 * Extiende de la clase abstracta Usuario e implementa la interfaz CreadorDeUsuarios.
 * Proporciona funcionalidad específica para profesores en el sistema de biblioteca.
 */
public class Profesor extends Usuario implements CreadorDeUsuarios {
    
    /**
     * Constructor para crear una instancia de Profesor.
     *
     * @param id Identificador único del profesor
     * @param nombre Nombre completo del profesor
     * @param email Dirección de correo electrónico del profesor
     * @param telefono Número de teléfono del profesor
     */
    public Profesor(int id, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
    }

    /**
     * Implementación del método de la interfaz CreadorDeUsuarios.
     * Notifica cuando un usuario de tipo profesor ha sido creado.
     * Muestra un mensaje por consola con el nombre del profesor creado.
     */
    @Override
    public void usuarioCreado() {
        System.out.println("El usuario profesor " + getNombre() + " ha sido creado.");
    }
}