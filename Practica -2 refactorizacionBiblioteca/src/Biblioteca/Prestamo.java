package Biblioteca;

import java.util.Date;
import java.util.List;

/**
 * Clase que representa un préstamo de libro en el sistema de biblioteca.
 * Contiene información sobre el libro prestado, el usuario que lo solicitó,
 * las fechas de préstamo y devolución, y el estado del préstamo.
 */
public class Prestamo {
    private int id;
    private int idLibro;
    private int idUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean devuelto;

    /**
     * Constructor para crear una instancia de Prestamo.
     *
     * @param id Identificador único del préstamo
     * @param idLibro Identificador del libro prestado
     * @param idUsuario Identificador del usuario que solicita el préstamo
     * @param fechaPrestamo Fecha en que se realiza el préstamo
     * @param fechaDevolucion Fecha en que se devuelve el libro (null si no se ha devuelto)
     * @param devuelto Estado que indica si el libro ha sido devuelto
     */
    public Prestamo(int id, int idLibro, int idUsuario, Date fechaPrestamo, Date fechaDevolucion, boolean devuelto) {
        this.id = id;
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
    }

    /**
     * Marca un préstamo como devuelto y actualiza el estado del libro.
     *
     * @param libroDevolucion El libro que está siendo devuelto
     * @param prestamo El préstamo asociado al libro que se está devolviendo
     */
    public static void marcarDevolucion(Libro libroDevolucion, Prestamo prestamo) {
        prestamo.setDevuelto(true);
        prestamo.setFechaDevolucion(new Date());
        
        // Marcar libro como disponible
        libroDevolucion.setDisponible(true);
        System.out.println("Libro devuelto con éxito.");
    }

    /**
     * Realiza un nuevo préstamo de libro a un usuario.
     *
     * @param libroPrestamo El libro que se está prestando
     * @param usuarioPrestamo El usuario que recibe el préstamo
     * @param prestamos Lista de préstamos donde se registrará el nuevo préstamo
     */
    public static void realizarPrestamo(Libro libroPrestamo, Usuario usuarioPrestamo, List<Prestamo> prestamos) {
        Prestamo nuevoPrestamo = new Prestamo(prestamos.size() + 1, libroPrestamo.getId(), usuarioPrestamo.getId(), new Date(), null, false);
        prestamos.add(nuevoPrestamo);
        libroPrestamo.setDisponible(false);
        System.out.println("Préstamo realizado con éxito.");
    }

    // Getters y setters con documentación Javadoc

    /**
     * Obtiene el ID del préstamo.
     *
     * @return El identificador único del préstamo
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del préstamo.
     *
     * @param id El nuevo identificador único del préstamo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el ID del libro prestado.
     *
     * @return El identificador del libro asociado al préstamo
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * Establece el ID del libro prestado.
     *
     * @param idLibro El nuevo identificador del libro asociado al préstamo
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * Obtiene el ID del usuario que solicitó el préstamo.
     *
     * @return El identificador del usuario asociado al préstamo
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el ID del usuario que solicitó el préstamo.
     *
     * @param idUsuario El nuevo identificador del usuario asociado al préstamo
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene la fecha en que se realizó el préstamo.
     *
     * @return La fecha de préstamo
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Establece la fecha en que se realizó el préstamo.
     *
     * @param fechaPrestamo La nueva fecha de préstamo
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene la fecha en que se devolvió el libro.
     *
     * @return La fecha de devolución (null si no se ha devuelto)
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha en que se devolvió el libro.
     *
     * @param fechaDevolucion La nueva fecha de devolución
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Verifica si el libro ha sido devuelto.
     *
     * @return true si el libro ha sido devuelto, false en caso contrario
     */
    public boolean getDevuelto() {
        return devuelto;
    }

    /**
     * Establece el estado de devolución del libro.
     *
     * @param devuelto El nuevo estado de devolución (true si se ha devuelto)
     */
    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
}