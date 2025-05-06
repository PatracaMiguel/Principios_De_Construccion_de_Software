package Biblioteca;

import java.util.Scanner;

/**
 * Clase principal que representa la aplicación de gestión de biblioteca.
 * Proporciona la interfaz de usuario para interactuar con el sistema de biblioteca.
 * 
 * <p>Esta clase contiene el método main que inicia la aplicación y maneja el menú principal,
 * delegando las operaciones específicas a la clase GestionarBiblioteca.</p>
 */
public class BibliotecaApp {
    /** Scanner para leer la entrada del usuario desde la consola */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que inicia la aplicación de biblioteca.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        GestionarBiblioteca biblioteca = new GestionarBiblioteca();
        biblioteca.inicializarDatos();
        
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    biblioteca.registrarLibro();
                    break;
                case 2:
                    biblioteca.registrarUsuario();
                    break;
                case 3:
                    biblioteca.prestarLibro();
                    break;
                case 4:
                    biblioteca.devolverLibro();
                    break;
                case 5:
                    biblioteca.buscarLibros();
                    break;
                case 6:
                    biblioteca.mostrarLibros();
                    break;
                case 7:
                    biblioteca.mostrarUsuarios();
                    break;
                case 8:
                    biblioteca.mostrarPrestamosActivos();
                    break;
                case 9:
                    salir = true;
                    System.out.println("Saliendo del sistema de biblioteca...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente nuevamente.");
            }
        }
        scanner.close();
    }

    /**
     * Muestra el menú principal de la aplicación con las opciones disponibles.
     * 
     * <p>El menú incluye todas las operaciones básicas del sistema:
     * <ul>
     *   <li>Registro de libros y usuarios</li>
     *   <li>Operaciones de préstamo y devolución</li>
     *   <li>Consultas y reportes</li>
     *   <li>Salida del sistema</li>
     * </ul>
     * </p>
     */
    public static void mostrarMenu() {
        System.out.println("\n--- SISTEMA DE GESTIÓN DE BIBLIOTECA ---");
        System.out.println("1. Registrar nuevo libro");
        System.out.println("2. Registrar nuevo usuario");
        System.out.println("3. Prestar libro");
        System.out.println("4. Devolver libro");
        System.out.println("5. Buscar libros");
        System.out.println("6. Ver todos los libros");
        System.out.println("7. Ver todos los usuarios");
        System.out.println("8. Ver préstamos activos");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }
}