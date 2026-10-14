import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titular de la cuenta: ");
        String nombre = scanner.nextLine();

        CuentaPuntos cuenta = new CuentaPuntos(nombre);

        System.out.print("Puntos a registrar: ");
        int cantidad = scanner.nextInt();

        boolean aceptado = cuenta.sumarPuntos(cantidad);

        if (aceptado) {
            System.out.println("¡Operación registrada con éxito!");
        } else {
            System.out.println("Error: La cantidad debe ser positiva.");
        }

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Puntos totales: " + cuenta.getPuntos());

        scanner.close();
    }
}