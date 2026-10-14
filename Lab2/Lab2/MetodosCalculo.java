public class MetodosCalculo {

    public static void main(String[] args) {
        // 1. Probamos el primer método que calcula un total
        double totalCompra = calcularTotal(85000, 3);
        System.out.println("Total de la compra: $" + totalCompra);

        // 2. Probamos el método del ejercicio del descuento
        double subtotal = 200000;
        double descuento = calcularDescuento(subtotal, 0.10);
        System.out.println("El descuento aplicado es: $" + descuento);
    }

    // Método 1: Recibe precio y cantidad, y RETORNA el total (tipo double)
    static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    // Método 2 (Ejercicio): Recibe subtotal y porcentaje, y RETORNA el valor a descontar
    static double calcularDescuento(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }
}