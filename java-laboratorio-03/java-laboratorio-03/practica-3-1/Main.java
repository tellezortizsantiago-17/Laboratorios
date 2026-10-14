public class Main {

    public static void main(String[] args) {
        // Primer objeto
        Producto producto = new Producto();
        producto.nombre = "Teclado";
        producto.precio = 85000;
        producto.cantidad = 3;

        // Segundo objeto
        Producto segundo = new Producto();
        segundo.nombre = "Mouse";
        segundo.precio = 45000;
        segundo.cantidad = 7;

        // Mostrar detalles y subtotales
        producto.mostrarDetalle();
        System.out.println("Subtotal primero: $" + producto.calcularSubtotal());
        
        System.out.println("-------------------");
        
        segundo.mostrarDetalle();
        System.out.println("Subtotal segundo: $" + segundo.calcularSubtotal());
    }
}