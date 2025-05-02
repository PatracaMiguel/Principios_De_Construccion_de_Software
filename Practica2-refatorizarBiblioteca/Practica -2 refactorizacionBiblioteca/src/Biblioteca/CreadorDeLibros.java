package Biblioteca;

/**
 * Interfaz CreadorDeLibros que define un contrato para la creación de libros en el sistema de biblioteca.
 * Contiene un método abstracto que debe ser implementado por las clases que representen tipos específicos de libros.
 */
public interface CreadorDeLibros {

    /**
     * Método abstracto que se invoca cuando un libro es creado.
     * Las clases que implementen esta interfaz deben proporcionar su propia implementación de este método.
     */
    public abstract void libroCreado();
    
}
