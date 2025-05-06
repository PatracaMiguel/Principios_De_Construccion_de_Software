/**
 * Refactorización  
 * Métodos de composición
 * Remplazar método por objeto
 */

public class ImprimirNombres {

     /**
     * Refactorización  
     * Métodos de composición
     * Extraer Variable
     */

    final int FIZZ = 3;
    final int BUZZ = 5;

    void imprimirNombre(int numero) {
   
        if (esFizzBuzz(numero)) {
                    System.out.println("FizzBuzz");
        } else 
                if (esFizz(numero)) {
                    System.out.println("Fizz");
            
        } else 
                if (esBuzz(numero)) {
                    System.out.println("Buzz");
        }
        else {
                    System.out.println(numero);
        }
    }

    /**
     * Refactorización
     * Métodos de composición
     * Método de extracción
     */
    private boolean esFizzBuzz(int numero) {
        return numero % FIZZ == 0 && numero % BUZZ == 0;
    }

    private boolean esFizz(int numero) {
        return numero % FIZZ == 0;
    }

    private boolean esBuzz(int numero) {
        return numero % BUZZ == 0;
    }
}
