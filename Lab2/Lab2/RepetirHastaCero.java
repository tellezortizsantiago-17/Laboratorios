import java.util.Scanner;

public class RepetirHastaCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Empezamos con un número cualquiera que no sea 0 para que el ciclo pueda arrancar
        int numero = -1; 

        System.out.println("Escribe números. El programa se detendrá cuando escribas 0.");

        // El ciclo se repetirá MIENTRAS el número sea DIFERENTE de 0
        while (numero != 0) {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.println("Escribiste el número: " + numero);
            }
        }

        System.out.println("¡Escribiste 0! Programa terminado.");
        scanner.close();
    }
}