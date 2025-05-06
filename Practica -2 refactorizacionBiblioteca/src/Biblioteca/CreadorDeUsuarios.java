package Biblioteca;
/**
 * Interfaz CreadorDeUsuarios que define un contrato para la creación de usuarios en el sistema de biblioteca.
 * Contiene un método abstracto que debe ser implementado por las clases que representen tipos específicos de usuarios.
 */

public interface CreadorDeUsuarios {

    /**
     * Método abstracto que se invoca cuando un usuario es creado.
     * Las clases que implementen esta interfaz deben proporcionar su propia implementación de este método.
     */
    public abstract void usuarioCreado();
    
}
