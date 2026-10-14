import java.util.Scanner;

public class AcumuladorInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        int acumulado = 0; // Este es nuestro acumulador

        System.out.println("Ingresa valores para sumar. Ingresa 0 para salir.");

        do {
            System.out.print("\nValor: ");
            valor = scanner.nextInt();

            // Solo sumamos si el valor no es 0
            if (valor != 0) {
                acumulado = acumulado + valor;
                System.out.println("Acumulado: " + acumulado);
            }

        } while (valor != 0); // El ciclo termina cuando el usuario escribe 0

        System.out.println("Programa finalizado. Total acumulado: " + acumulado);
        
        scanner.close();
    }
}