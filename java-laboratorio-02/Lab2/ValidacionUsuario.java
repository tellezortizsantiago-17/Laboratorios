public class ValidacionUsuario {
    public static void main(String[] args) {
        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        // Muestra el resultado usando .equals()
        System.out.println("Usando .equals(): " + usuarioRegistrado.equals(usuarioIngresado));

        // Muestra el resultado usando .equalsIgnoreCase()
        System.out.println("Usando .equalsIgnoreCase(): " + usuarioRegistrado.equalsIgnoreCase(usuarioIngresado));
    }
}