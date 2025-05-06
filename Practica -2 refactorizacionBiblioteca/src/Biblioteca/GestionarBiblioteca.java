package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal para gestionar las operaciones de la biblioteca.
 * Permite registrar libros, usuarios, realizar préstamos y devoluciones,
 * así como consultar información del sistema.
 */
public class GestionarBiblioteca {
    /** Lista de libros en la biblioteca */
    public static ArrayList<Libro> libros = new ArrayList<>();
    /** Lista de usuarios registrados */
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    /** Lista de préstamos realizados */
    public static ArrayList<Prestamo> prestamos = new ArrayList<>();
    /** Scanner para entrada de datos por consola */
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Inicializa datos de ejemplo en el sistema.
     * Crea libros y usuarios de prueba para demostración.
     */
    public void inicializarDatos() {
        // Libros de ejemplo
        libros.add(new LibroAudiolibro(1, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Ficción", true, "12 minutos"));
        libros.add(new LibroDigital(2, "Cien años de soledad", "Gabriel García Márquez", 1967, "Novela", true, "12 horas"));
        libros.add(new LibroFisico(3, "El principito", "Antoine de Saint-Exupéry", 1943, "Fábula", true));
              
        // Usuarios de ejemplo
        usuarios.add(new Estudiante(101, "Jose Camacho", "jantonio@gmail.com", "123456789"));
        usuarios.add(new Profesor(102, "Patricia Moreno", "patricia@gmail.com", "987654321"));
    }

    /**
     * Registra un nuevo libro en el sistema según el tipo seleccionado.
     * Muestra menú de opciones y redirige al método específico según el tipo.
     */
    public void registrarLibro() {
        System.out.println("--- REGISTRAR NUEVO LIBRO ---");
        System.out.println(" 1. Libro Físico  2. Libro Digital  3. Libro Audiolibro 4.Cancelar");
        int tipoLibro = scanner.nextInt();
        Libro nuevoLibro = null;

        switch (tipoLibro) {
            case 1:
                 nuevoLibro = registrarLibroFisico();
                 libros.add(nuevoLibro);
                break;
        
            case 2:
                nuevoLibro = registrarLibroDigital();
                libros.add(nuevoLibro);
                break;
                
            case 3:
                nuevoLibro = registrarLibroAudiolibro();
                libros.add(nuevoLibro);
                break;
            case 4:
                System.out.println("Operación cancelada.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    /**
     * Registra un nuevo libro físico solicitando datos al usuario.
     * @return El libro físico creado
     */
    public Libro registrarLibroFisico() {
        System.out.println("--- CREAR LIBRO FISICO ---");
        
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine(); 
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        
        LibroFisico nuevoLibro = new LibroFisico(id, titulo, autor, anio, genero, true);
        nuevoLibro.libroCreado();
        return nuevoLibro;  
    }

    /**
     * Registra un nuevo libro digital solicitando datos al usuario.
     * @return El libro digital creado
     */
    public static Libro registrarLibroDigital() {
        System.out.println("--- CREAR LIBRO DIGITAL ---");
        
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine(); 
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        
        System.out.print("Formato: ");
        String formato = scanner.nextLine();
        
        LibroDigital nuevoLibro = new LibroDigital(id, titulo, autor, anio, genero, true, formato);
        nuevoLibro.libroCreado();
        return nuevoLibro;
    }

    /**
     * Registra un nuevo audiolibro solicitando datos al usuario.
     * @return El audiolibro creado
     */
    public Libro registrarLibroAudiolibro() {        
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine(); 
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        
        System.out.print("Duración: ");
        String duracion = scanner.nextLine();

        LibroAudiolibro nuevoLibro = new LibroAudiolibro(id, titulo, autor, anio, genero, true, duracion);
        nuevoLibro.libroCreado();
        return nuevoLibro;
    }

    /**
     * Registra un nuevo usuario en el sistema según el tipo seleccionado.
     * Muestra menú de opciones y redirige al método específico según el tipo.
     */
    public void registrarUsuario() {
        System.out.println("--- REGISTRAR NUEVO USUARIO ---");
        System.out.println("1. Usuario Profesor  2. Usuario Estudiante  3.Cancelar");
        int tipoUsuario = scanner.nextInt();
        Usuario nuevoUsuario = null;
        
        switch (tipoUsuario) {
            case 1:
                nuevoUsuario = registrarProfesor();
                usuarios.add(nuevoUsuario);
                break;
            
            case 2:
                nuevoUsuario = registrarEstudiante();
                usuarios.add(nuevoUsuario);
                break;
            case 3:
                System.out.println("Operación cancelada.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    /**
     * Registra un nuevo profesor solicitando datos al usuario.
     * @return El profesor creado
     */
    public Usuario registrarProfesor() {
        System.out.println("--- CREAR USUARIO PROFESOR ---");
        
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        
        Profesor nuevoUsuario = new Profesor(id, nombre, email, telefono);
        nuevoUsuario.usuarioCreado();
        return nuevoUsuario;
    }

    /**
     * Registra un nuevo estudiante solicitando datos al usuario.
     * @return El estudiante creado
     */
    public Usuario registrarEstudiante() {
        System.out.println("--- CREAR USUARIO ESTUDIANTE ---");
        
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        
        Estudiante nuevoUsuario = new Estudiante(id, nombre, email, telefono);
        nuevoUsuario.usuarioCreado();
        return nuevoUsuario;
    }

    /**
     * Verifica los préstamos activos de un usuario.
     * @param usuarioPrestamo Usuario a verificar
     */
    public void verificarPrestamos(Usuario usuarioPrestamo) {
        int librosUsuario = 0;
        for (Prestamo p : prestamos) {
            if (p.getIdUsuario() == usuarioPrestamo.getId() && !p.getDevuelto()) {
                librosUsuario++;
            }
        }
        
        if (librosUsuario >= 3) {
            System.out.println("Error: El usuario ya tiene 3 libros prestados.");
            return;
        }
    }

    /**
     * Realiza el préstamo de un libro a un usuario.
     * Verifica disponibilidad y límites antes de realizar el préstamo.
     */
    public void prestarLibro() {
        System.out.println("--- PRESTAR LIBRO ---");
        Libro libroPrestamo = buscarLibro();
        Usuario usuarioPrestamo = buscarUsuario();

        if (libroPrestamo == null || usuarioPrestamo == null) {
            return;
        }

        if (!libroPrestamo.getDisponible()) {
            System.out.println("Error: El libro no está disponible actualmente.");
            return;
        }
        
        verificarPrestamos(usuarioPrestamo);
        
        Prestamo.realizarPrestamo(libroPrestamo, usuarioPrestamo, prestamos);        
    }

    /**
     * Procesa la devolución de un libro.
     * Marca el préstamo como devuelto y el libro como disponible.
     */
    public void devolverLibro() {
        System.out.println("--- DEVOLVER LIBRO ---");

        Libro libroDevolucion = buscarLibro();
        if (libroDevolucion == null) {
            return;
        }
        
        Prestamo prestamo = buscarPrestamoActivo(libroDevolucion);
        if (prestamo == null) {
            return;
        }

        Prestamo.marcarDevolucion(libroDevolucion, prestamo);
    }

    /**
     * Muestra la información detallada de un libro.
     * @param libro Libro a mostrar
     */
    public static void mostrarInformacionLibro(Libro libro) {
        System.out.println("ID: " + libro.getId() + " | Título: " + libro.getTitulo() + 
                         " | Autor: " + libro.getAutor() + " | Año: " + libro.getAnio() + 
                         " | Género: " + libro.getGenero() + 
                         " | Disponible: " + (libro.getDisponible() ?"Sí" : "No"));
    }

    /**
     * Busca un libro por su ID.
     * @return El libro encontrado o null si no existe
     */
    public Libro buscarLibro() {
        System.out.println("Buscar por ID.");
        int idLibro = scanner.nextInt();
        scanner.nextLine();  

        for (Libro libroBuscar : libros) {
            if (libroBuscar.getId() == idLibro) {
                return libroBuscar;
            }    
        }
        System.out.println("Error: Libro no encontrado.");
        return null;
    }

    /**
     * Busca libros según diferentes criterios.
     * Permite búsqueda por ID, título, autor o género.
     */
    public void buscarLibros() {
        System.out.println("--- BUSCAR LIBROS ---");
        System.out.println("1. Buscar por ID.");
        System.out.println("2. Buscar por título");
        System.out.println("3. Buscar por autor");
        System.out.println("4. Buscar por género");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Ingrese término de búsqueda: ");
        String termino = scanner.nextLine().toLowerCase();
        
        boolean encontrado = false;
        
        System.out.println("Resultados:");
        for (Libro libro : libros) {
            boolean coincide = false;
            
            switch (opcion) {
                case 1:
                    coincide = String.valueOf(libro.getId()).contains(termino);
                    break;
                case 2:
                    coincide = libro.getTitulo().toLowerCase().contains(termino);
                    break;
                case 3:
                    coincide = libro.getAutor().toLowerCase().contains(termino);
                    break;
                case 4:
                    coincide = libro.getGenero().toLowerCase().contains(termino);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
            if (coincide) {
                mostrarInformacionLibro(libro);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron libros que coincidan con la búsqueda.");
        }
    }

    /**
     * Muestra todos los libros registrados en el sistema.
     */
    public void mostrarLibros() {
        System.out.println("--- LISTADO DE LIBROS ---");
        
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        
        for (Libro libro : libros) {
            mostrarInformacionLibro(libro);
        }
    }

    /**
     * Muestra la información detallada de un usuario.
     * @param usuario Usuario a mostrar
     */
    public static void mostrarInformacionUsuario(Usuario usuario) {
        System.out.println("ID: " + usuario.getId() + " | Nombre: " + usuario.getNombre() + 
         " | Email: " + usuario.getEmail() + " | Teléfono: " + usuario.getTelefono() +
         " | Tipo: " + (usuario instanceof Estudiante ? "Estudiante" : "Profesor"));
    }

    /**
     * Muestra todos los usuarios registrados en el sistema.
     */
    public void mostrarUsuarios() {
        System.out.println("--- LISTADO DE USUARIOS ---");
        
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        
        for (Usuario usuario : usuarios) {
            mostrarInformacionUsuario(usuario);
        }
    }

    /**
     * Busca un usuario por su ID.
     * @return El usuario encontrado o null si no existe
     */
    public Usuario buscarUsuario() {
        System.out.println("--- BUSCAR USUARIO ---");
        System.out.print("Ingrese ID del usuario: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        
        for (Usuario usuarioBuscar : usuarios) {
            if (usuarioBuscar.getId() == idUsuario) {
                return usuarioBuscar;
            } 
        }
        System.out.println("Error: Usuario no encontrado.");
        return null;
    }

    /**
     * Muestra la información detallada de un préstamo.
     * @param prestamo Préstamo a mostrar
     */
    public static void mostrarInformacionPrestamo(Prestamo prestamo) {
        System.out.println("ID Préstamo: " + prestamo.getId() + 
                         " | ID Libro: " + prestamo.getIdLibro() + 
                         " | ID Usuario: " + prestamo.getIdUsuario() + 
                         " | Fecha Préstamo: " + prestamo.getFechaPrestamo() + 
                         " | Fecha Devolución: " + prestamo.getFechaDevolucion() + 
                         " | Devuelto: " + (prestamo.getDevuelto() ? "Sí" : "No"));
    }

    /**
     * Busca un préstamo activo para un libro específico.
     * @param libro Libro a buscar en préstamos
     * @return El préstamo activo o null si no existe
     */
    public static Prestamo buscarPrestamoActivo(Libro libro) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIdLibro() == libro.getId() && !prestamo.getDevuelto()) {
                return prestamo;
            }
        }
        
        System.out.println("Error: No hay préstamos activos para este libro.");
        return null;
    }

    /**
     * Muestra todos los préstamos activos en el sistema.
     * Incluye información del libro y usuario asociado a cada préstamo.
     */
    public void mostrarPrestamosActivos() {
        System.out.println("--- PRÉSTAMOS ACTIVOS ---");
        
        boolean hayPrestamos = false;
        
        for (Prestamo prestamo : prestamos) {
            if (!prestamo.getDevuelto()) {
                Libro libro = null;
                Usuario usuario = null;
                
                // Buscar libro y usuario asociados
                for (Libro l : libros) {
                    if (l.getId() == prestamo.getIdLibro()) {
                        libro = l;
                        break;
                    }
                }
                
                for (Usuario u : usuarios) {
                    if (u.getId() == prestamo.getIdUsuario()) {
                        usuario = u;
                        break;
                    }
                }
                
                if (libro != null && usuario != null) {
                    mostrarInformacionPrestamo(prestamo);
                    hayPrestamos = true;
                }
            }
        }
        
        if (!hayPrestamos) {
            System.out.println("No hay préstamos activos.");
        }
    }
}