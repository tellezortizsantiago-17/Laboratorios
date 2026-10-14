import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        double porcentaje = 0.0; // Empezamos asumiendo que no hay descuento

        // Calcular el porcentaje de descuento usando if / else if
        if (valorCompra >= 500000) {
            porcentaje = 0.15; // 15%
        } else if (valorCompra >= 250000) {
            porcentaje = 0.10; // 10%
        } else if (valorCompra >= 100000) {
            porcentaje = 0.05; // 5%
        } else {
            porcentaje = 0.0;  // 0%
        }

        // Calcular los valores finales
        double valorDescuento = valorCompra * porcentaje;
        double totalFinal = valorCompra - valorDescuento;

        // Mostrar los resultados
        System.out.println("\n--- Resumen de la factura ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor original: $" + valorCompra);
        System.out.println("Porcentaje aplicado: " + (porcentaje * 100) + "%");
        System.out.println("Valor del descuento: $" + valorDescuento);
        System.out.println("Total final a pagar: $" + totalFinal);

        scanner.close();
    }
}