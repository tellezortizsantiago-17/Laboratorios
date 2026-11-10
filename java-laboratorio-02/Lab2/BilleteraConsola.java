import java.util.Scanner;

public class BilleteraConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0; // Empezamos con la cuenta en cero
        int opcion;

        do {
            mostrarMenu(); // Llamamos al método void que imprime las opciones
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarSaldo(saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a consignar: $");
                    double monto = scanner.nextDouble();
                    // Actualizamos el saldo con lo que retorna el método consignar
                    saldo = consignar(saldo, monto); 
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a retirar: $");
                    double monto = scanner.nextDouble();
                    // Actualizamos el saldo con lo que retorna el método retirar
                    saldo = retirar(saldo, monto);
                }
                case 0 -> System.out.println("Gracias por usar su Billetera Virtual. ¡Hasta pronto!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    // --- MÉTODOS DE LA APLICACIÓN ---

    static void mostrarMenu() {
        System.out.println("\n--- BILLETERA VIRTUAL ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Consignar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    static void mostrarSaldo(double saldoActual) {
        System.out.println("Su saldo actual es: $" + saldoActual);
    }

    static double consignar(double saldoActual, double monto) {
        if (monto > 0) {
            System.out.println("¡Consignación exitosa!");
            return saldoActual + monto;
        } else {
            System.out.println("Error: El monto a consignar debe ser mayor a cero.");
            return saldoActual; // Retorna el mismo saldo sin cambios
        }
    }

    static double retirar(double saldoActual, double monto) {
        if (monto > saldoActual) {
            System.out.println("Error: Fondos insuficientes.");
            return saldoActual; // Retorna el saldo intacto
        } else if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a cero.");
            return saldoActual;
        } else {
            System.out.println("¡Retiro exitoso!");
            return saldoActual - monto;
        }
    }
}