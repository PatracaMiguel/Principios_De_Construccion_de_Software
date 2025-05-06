package Biblioteca;

/**
 * Clase que representa un libro digital en el sistema de biblioteca.
 * Extiende de la clase Libro e implementa la interfaz CreadorDeLibros.
 * Incluye características específicas de libros digitales como el formato.
 */
public class LibroDigital extends Libro implements CreadorDeLibros {
    /** Formato del libro digital (PDF, EPUB, MOBI, etc.) */
    private String formato;

    /**
     * Constructor para crear una instancia de LibroDigital.
     *
     * @param id Identificador único del libro
     * @param titulo Título del libro digital
     * @param autor Autor del libro
     * @param anio Año de publicación
     * @param genero Género literario
     * @param disponible Estado de disponibilidad
     * @param formato Formato del archivo digital
     */
    public LibroDigital(int id, String titulo, String autor, int anio, String genero, boolean disponible, String formato) {
        super(id, titulo, autor, anio, genero, disponible);
        this.formato = formato;
    }

    /**
     * Implementación del método de la interfaz CreadorDeLibros.
     * Notifica cuando un libro digital ha sido creado.
     * Muestra un mensaje por consola con el título del libro.
     */
    @Override
    public void libroCreado() {
        System.out.println("El libro digital " + getTitulo() + " ha sido creado.");
    }

    /**
     * Obtiene el formato del libro digital.
     *
     * @return Formato del archivo (PDF, EPUB, MOBI, etc.)
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Establece el formato del libro digital.
     *
     * @param formato Nuevo formato del archivo
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }
}