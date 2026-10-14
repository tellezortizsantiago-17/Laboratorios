import java.util.Scanner;

public class MenuRepetitivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Iniciamos con un valor diferente a 0 para que entre al while

        // El menú se repetirá MIENTRAS la opción NO sea 0
        while (opcion != 0) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar mensaje");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            // Evaluamos la opción elegida
            switch (opcion) {
                case 1 -> System.out.println("Hola.");
                case 2 -> System.out.println("Java continúa ejecutándose.");
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}