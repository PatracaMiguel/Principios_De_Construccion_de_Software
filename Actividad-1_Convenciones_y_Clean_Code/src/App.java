import seleccion.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Entrenador entrenador = new Entrenador(1, "Abraham", "Barrera", 23, 1);
        entrenador.concentrase();
        entrenador.dirigirPartido();
        entrenador.dirigirEntrenamiento();

        Masajista masajista = new Masajista(2, "Rogelio", "Rojas", 19, "Masajista", 3);
        masajista.concentrase();
        masajista.darMasaje();

        Futbolista futbolista = new Futbolista(3, "Miguel", "Patraca", 19, 7, "Centrocampista");
        futbolista.concentrase();
        futbolista.jugarPartido();
        futbolista.entrenar();  

    }
}
