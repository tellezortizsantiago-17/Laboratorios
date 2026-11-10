import java.util.Scanner;

public class AccesoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Credenciales correctas
        String usuarioCorrecto = "admin";
        String claveCorrecta = "java21";

        // Solicitar datos al usuario
        System.out.print("Ingrese nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        String claveIngresada = scanner.nextLine();

        // Validar ambas condiciones con &&
        if (usuarioIngresado.equals(usuarioCorrecto) && claveIngresada.equals(claveCorrecta)) {
            System.out.println("Acceso concedido. ¡Bienvenido!");
        } else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}