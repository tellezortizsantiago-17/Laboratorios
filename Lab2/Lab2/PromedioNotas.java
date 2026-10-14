import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de notas a registrar: ");
        int cantidadNotas = scanner.nextInt();

        double suma = 0; // Este es nuestro ACUMULADOR

        // El ciclo se repetirá tantas veces como cantidad de notas indicó el usuario
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            
            suma = suma + nota; // Aquí acumulamos el valor de la nota
        }

        // Calculamos el promedio dividiendo la suma total entre la cantidad de notas
        double promedio = suma / cantidadNotas;
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}