
public class App  implements fizzBuzz {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            System.out.print( "");
            numerosFizzBuzz(i);
            System.out.println( " ");
            }
    }
            
            
public static void numerosFizzBuzz (int numeroIterado) {
    if (numeroIterado % 3 == 0 && numeroIterado % 5 == 0) {
        System.out.print(  " FizzBuzz");
    }
    else{
        if (numeroIterado % 3 == 0) {
            System.out.print(" Fizz");
        }
        else{
            if (numeroIterado % 5 == 0) {
                System.out.print( " Buzz");
            }
        }

    }
}
}