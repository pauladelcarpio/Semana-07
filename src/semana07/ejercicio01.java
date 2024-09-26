
package semana07;
import java.util.Scanner ;

public class ejercicio01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String operacion;
            
            do {
                System.out.print("Ingresa la operación (suma, resta, multiplicación, división) o 'salir' para terminar: ");
                operacion = scanner.nextLine();
                
                if (!operacion.equalsIgnoreCase("salir")) {
                    System.out.print("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    
                    switch (operacion.toLowerCase()) {
                        case "suma" -> System.out.println("Resultado: " + (num1 + num2));
                        case "resta" -> System.out.println("Resultado: " + (num1 - num2));
                        case "multiplicación" -> System.out.println("Resultado: " + (num1 * num2));
                        case "división" -> {
                            if (num2 != 0) {
                                System.out.println("Resultado: " + (num1 / num2));
                            } else {
                                System.out.println("No se puede dividir por cero.");
                            }
                        }
                        default -> System.out.println("Operación no válida.");
                    }
                }
            } while (!operacion.equalsIgnoreCase("salir"));
            
            System.out.println("Calculadora cerrada.");
        }
    }
}

    
  
