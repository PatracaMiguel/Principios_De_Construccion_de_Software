package Biblioteca;

/**
 * Clase abstracta que representa un libro en el sistema de biblioteca.
 * Contiene los atributos y métodos básicos que comparten todos los tipos de libros.
 * Esta clase debe ser extendida por las clases concretas de libros (físico, digital, audiolibro).
 */
public abstract class Libro {
    /** Identificador único del libro */
    private int id;
    
    /** Título del libro */
    private String titulo;
    
    /** Autor del libro */
    private String autor;
    
    /** Año de publicación del libro */
    private int anio;
    
    /** Género literario del libro */
    private String genero;
    
    /** Estado de disponibilidad del libro (true si está disponible para préstamo) */
    private boolean disponible;

    /**
     * Constructor para crear una instancia de Libro.
     *
     * @param id Identificador único del libro
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param anio Año de publicación
     * @param genero Género literario
     * @param disponible Estado inicial de disponibilidad
     */
    public Libro(int id, String titulo, String autor, int anio, String genero, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.disponible = disponible;
    }

    // Getters y setters con documentación Javadoc

    /**
     * Obtiene el identificador único del libro.
     *
     * @return El ID del libro
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del libro.
     *
     * @param id El nuevo ID del libro
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo El nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El nuevo nombre del autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     *
     * @return El año de publicación
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Establece el año de publicación del libro.
     *
     * @param anio El nuevo año de publicación
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Obtiene el género literario del libro.
     *
     * @return El género del libro
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género literario del libro.
     *
     * @param genero El nuevo género del libro
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Verifica la disponibilidad del libro.
     *
     * @return true si el libro está disponible para préstamo, false en caso contrario
     */
    public boolean getDisponible() {
        return disponible;
    }

    /**
     * Establece la disponibilidad del libro.
     *
     * @param disponible Nuevo estado de disponibilidad
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}