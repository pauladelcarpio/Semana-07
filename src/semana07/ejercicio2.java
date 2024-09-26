
package semana07;
import java.util.Scanner ;
public class ejercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            
            do {
                System.out.print("Ingresa un número (0 para salir): ");
                numero = scanner.nextInt();
                suma += numero;
            } while (numero != 0);
            
            System.out.println("La suma total es: " + suma);
        }
    }
}

        


   
    
    

