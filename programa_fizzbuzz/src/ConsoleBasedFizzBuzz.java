public class ConsoleBasedFizzBuzz extends ImprimirNombres implements fizzBuzz {

    
    @Override
    public void imprimirNumeros (int from , int to) {
        for (int i = from; i <= to; i++) {
            ImprimirNombres imprimirNombre = new ImprimirNombres();
            imprimirNombre.imprimirNombre(i);
        }
    }

 


}