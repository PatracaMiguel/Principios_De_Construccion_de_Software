package seleccion;

/**
 * Esta clase sigue la convención de nombrado de Google Java Style Guide (sección 4.8.6.1),
 * que indica que Los comentarios de bloque se aplican sangría en el mismo nivel que el código circundante.
 * Pueden ser de estilo o de estilo. En el caso de los comentarios de varias líneas,
 * las líneas siguientes deben comenzar con alineado con el de la línea anterior.
 */
public class Futbolista extends Empleado {
    private int numeroJugador;
    private String posicionEnCancha;

    /*
     * Constructor de la clase Futbolista.
     * Inicializa los atributos específicos de un futbolista,
     * como el número de jugador y la posición en la cancha.
     */
    public Futbolista(int id, String nombre, String apellido, int edad, int numeroJugador, String posicionEnCancha) {
        super(id, nombre, apellido, edad);
        this.numeroJugador = numeroJugador;
        this.posicionEnCancha = posicionEnCancha;
    }

     // Método para mostrar que jugador está concentrado en el juego
    @Override
    public void concentrase() {
        System.out.println("El futbolista " + getNombre() + " está concentrado en el juego");
    }

    // Método para mostrar que jugador está viajando
    @Override
    public void viajar() {
        System.out.println("El futbolista " + getNombre() + " está viajando");
    }

    // Método para mostrar que jugador está jugando en el partido
    public void jugarPartido(){
        System.out.println( getNombre() + " esta jugando en el partido");
    }

    // Método para mostrar que jugador está entrenando
    public void entrenar(){
        System.out.println( getNombre() + " está entrenando");
    }

    // Método para mostrar el numero de jugador
    public int getNumeroJugador() {
        return numeroJugador;
    }

    // Método para establecer el numero de jugador
    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    // Método para mostrar la posición en la cancha
    public String getPosicionEnCancha() {
        return posicionEnCancha;
    }

    // Método para establecer la posición en la cancha
    public void setPosicionEnCancha(String posicionEnCancha) {
        this.posicionEnCancha = posicionEnCancha;
    }   
}
