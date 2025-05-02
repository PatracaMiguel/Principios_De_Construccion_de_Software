package Biblioteca;

/**
 * Clase que representa un audiolibro en el sistema de biblioteca.
 * Extiende de la clase Libro e implementa la interfaz CreadorDeLibros.
 * Incluye características específicas de audiolibros como la duración.
 */
public class LibroAudiolibro extends Libro implements CreadorDeLibros {
    /** Duración del audiolibro en formato HH:MM:SS */
    private String duracion;

    /**
     * Constructor para crear una instancia de LibroAudiolibro.
     *
     * @param id Identificador único del audiolibro
     * @param titulo Título del audiolibro
     * @param autor Autor del audiolibro
     * @param anio Año de publicación
     * @param genero Género literario
     * @param disponible Estado de disponibilidad
     * @param duracion Duración en formato HH:MM:SS
     */
    public LibroAudiolibro(int id, String titulo, String autor, int anio, String genero, boolean disponible, String duracion) {
        super(id, titulo, autor, anio, genero, disponible);
        this.duracion = duracion;
    }

    /**
     * Implementación del método de la interfaz CreadorDeLibros.
     * Notifica cuando un audiolibro ha sido creado.
     * Muestra un mensaje por consola con el título del audiolibro.
     */
    @Override
    public void libroCreado() {
        System.out.println("El audiolibro " + getTitulo() + " ha sido creado.");
    }

    /**
     * Obtiene la duración del audiolibro.
     *
     * @return Duración en formato HH:MM:SS
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración del audiolibro.
     *
     * @param duracion Nueva duración en formato HH:MM:SS
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}