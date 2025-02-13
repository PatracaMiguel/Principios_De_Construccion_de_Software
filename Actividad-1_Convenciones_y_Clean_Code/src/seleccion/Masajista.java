package seleccion;

public class Masajista extends Empleado {
    private String profesion;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

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
