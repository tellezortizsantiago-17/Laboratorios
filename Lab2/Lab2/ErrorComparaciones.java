public class ErrorComparaciones {
    public static void main(String[] args) {
        int edad = 20;
        boolean activo = true;

        // Usamos >= para comparar si es mayor o igual a 18
        boolean mayorEdad = edad >= 18; 
        
        // Usamos && para unir las dos condiciones
        boolean habilitado = edad >= 18 && activo; 

        System.out.println(mayorEdad);
        System.out.println(habilitado);
    }
}
