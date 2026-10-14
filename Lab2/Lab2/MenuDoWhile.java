import java.util.Scanner;

public class MenuDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion; // No necesitamos inicializarla con -1 como en el while

        do {
            System.out.println("\n--- MENÚ DO WHILE ---");
            System.out.println("1. Continuar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("¡Continuamos!");
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0); // La condición se evalúa al final

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}