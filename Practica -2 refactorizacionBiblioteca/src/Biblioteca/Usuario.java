package Biblioteca;

/**
 * Clase abstracta Usuario que representa un usuario de la biblioteca.
 * Contiene atributos comunes a todos los tipos de usuarios.
 */
public abstract class Usuario {
    /** Identificador único del usuario */
    private int id;
    
    /** Nombre completo del usuario */
    private String nombre;
    
    /** Dirección de correo electrónico del usuario */
    private String email;
    
    /** Número de teléfono del usuario */
    private String telefono;

    /**
     * Constructor para crear una instancia de Usuario.
     *
     * @param id Identificador único del usuario
     * @param nombre Nombre completo del usuario
     * @param email Dirección de correo electrónico del usuario
     * @param telefono Número de teléfono del usuario
     */
    public Usuario(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Obtiene el identificador del usuario.
     *
     * @return El identificador único del usuario
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param id El nuevo identificador único del usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre completo del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nuevo nombre completo del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el email del usuario.
     *
     * @return La dirección de correo electrónico del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del usuario.
     *
     * @param email La nueva dirección de correo electrónico del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el teléfono del usuario.
     *
     * @return El número de teléfono del usuario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del usuario.
     *
     * @param telefono El nuevo número de teléfono del usuario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}