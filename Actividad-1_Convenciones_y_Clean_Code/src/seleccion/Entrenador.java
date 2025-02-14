package seleccion;
 /**
 * Esta clase sigue la convención de nombrado de Google Java Style Guide (sección 5.2.2),
 * que recomienda usar camelCase para nombres de clases, métodos y atributos.
 */
public class Entrenador  extends Empleado{
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrase() {
        System.out.println("El entrenador " + getNombre() + " está concentrado en el juego");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + getNombre() + " está viajando");
    }
  
    public void dirigirPartido(){
        System.out.println( "El entrenador " + getNombre() + " está dirigiendo el partido");
    }
    
    public void  dirigirEntrenamiento(){
        System.out.println( "El entrenador " + getNombre() + " dirige el entrenamiento");
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    } 
    
}
