public class MostrarProducto {

    public static void main(String[] args) {
        // Llamamos al método varias veces enviando diferentes datos
        mostrarProducto("Teclado Mecánico", 150000);
        mostrarProducto("Mouse Inalámbrico", 85000);
        mostrarProducto("Monitor 24 pulgadas", 650000);
    }

    // Este método espera recibir un String (nombre) y un double (precio)
    static void mostrarProducto(String nombre, double precio) {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}