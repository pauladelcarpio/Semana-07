
package semana07;
import java.util.Scanner ;
public class ejercicio03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String contrasena;
            
            do {
                System.out.print("Ingresa la contraseña: ");
                contrasena = scanner.nextLine();
                
                if (!contrasena.equals("secreto")) {
                    System.out.println("Contraseña incorrecta, intenta de nuevo.");
                }
            } while (!contrasena.equals("secreto"));
            
            System.out.println("¡Acceso concedido!");
        }
    }
}

    
    
    

