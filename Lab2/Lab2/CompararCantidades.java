public class CompararCantidades {
    public static void main(String[] args) {
        int inventario = 12;
        int cantidadSolicitada = 8;

        // 1. Si hay inventario suficiente
        boolean haySuficiente = inventario >= cantidadSolicitada;
        
        // 2. Si la cantidad solicitada es exactamente igual al inventario
        boolean esExactamenteIgual = cantidadSolicitada == inventario;
        
        // 3. Si la cantidad solicitada supera el inventario
        boolean superaInventario = cantidadSolicitada > inventario;

        System.out.println("¿Hay inventario suficiente? " + haySuficiente);
        System.out.println("¿Es exactamente igual al inventario? " + esExactamenteIgual);
        System.out.println("¿Supera el inventario? " + superaInventario);
    }
}