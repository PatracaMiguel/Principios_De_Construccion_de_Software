package seleccion;

 /**
 * Esta clase sigue la convención de nombrado de Google Java Style Guide (sección 4.8.7),
 * que indica que los modificadores de clase y miembro, cuando están presentes,
 *  aparecen en el orden recomendado por la especificación del lenguaje Java.
 */
public class Masajista extends Empleado {
    private String profesion;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

     /**
    * Este método sigue la convención de nombrado de Google Java Style Guide (sección 6.1),
    * que indica que Un método se marca con la anotación siempre que sea legal.
    * Esto incluye un método de clase que reemplaza un método de superclase,
    * un método de clase Implementación de un método de interfaz y un método de interfaz que vuelve a especificar una superinterfaz método.
    */
    @Override
    public void concentrase() {
        System.out.println("El masajista " + getNombre() + " está concentrado en el juego");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " está viajando");
    }

    public void darMasaje(){
        System.out.println( getNombre() + " está preparando el masaje");
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }   
    
}
