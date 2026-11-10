public class PrimerMetodo {

    public static void main(String[] args) {
        mostrarTitulo(); // Primera vez que llamamos al método
        mostrarTitulo(); // Segunda vez que llamamos al método
    }

    // Aquí abajo declaramos nuestro método personalizado
    static void mostrarTitulo() {
        System.out.println("====================");
        System.out.println("     APLICACIÓN");
        System.out.println("====================");
    }
}