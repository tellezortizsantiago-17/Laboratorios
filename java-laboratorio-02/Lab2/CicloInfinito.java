public class CicloInfinito {
    public static void main(String[] args) {
        int numero = 1;
        
        while (numero <= 5) {
            System.out.println(numero);
            numero++; // ¡Esta es la línea clave que faltaba!
        }
    }
}