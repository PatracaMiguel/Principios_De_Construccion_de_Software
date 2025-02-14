package seleccion;

public class Futbolista extends Empleado {
    private int numeroJugador;
    private String posicionEnCancha;

    public Futbolista(int id, String nombre, String apellido, int edad, int numeroJugador, String posicionEnCancha) {
        super(id, nombre, apellido, edad);
        this.numeroJugador = numeroJugador;
        this.posicionEnCancha = posicionEnCancha;
    }

    @Override
    public void concentrase() {
        System.out.println("El futbolista " + getNombre() + " está concentrado en el juego");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista " + getNombre() + " está viajando");
    }

    public void jugarPartido(){
        System.out.println( getNombre() + " esta jugando en el partido");
    }

    public void entrenar(){
        System.out.println( getNombre() + " está entrenando");
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public String getPosicionEnCancha() {
        return posicionEnCancha;
    }

    public void setPosicionEnCancha(String posicionEnCancha) {
        this.posicionEnCancha = posicionEnCancha;
    }   
}
