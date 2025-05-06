package Biblioteca;

/**
 * Clase que representa un libro físico en el sistema de biblioteca.
 * Extiende de la clase Libro e implementa la interfaz CreadorDeLibros.
 * Representa libros tradicionales en formato impreso.
 */
public class LibroFisico extends Libro implements CreadorDeLibros {
    /**
     * Constructor para crear una instancia de LibroFisico.
     *
     * @param id Identificador único del libro
     * @param titulo Título del libro físico
     * @param autor Autor del libro
     * @param anio Año de publicación
     * @param genero Género literario
     * @param disponible Estado de disponibilidad
     */
    public LibroFisico(int id, String titulo, String autor, int anio, String genero, boolean disponible) {
        super(id, titulo, autor, anio, genero, disponible);
    }

    /**
     * Implementación del método de la interfaz CreadorDeLibros.
     * Notifica cuando un libro físico ha sido creado.
     * Muestra un mensaje por consola con el título del libro.
     */
    @Override
    public void libroCreado() {
        System.out.println("El libro físico " + getTitulo() + " ha sido creado.");
    }
}
