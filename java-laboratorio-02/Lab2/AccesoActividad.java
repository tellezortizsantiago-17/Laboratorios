public class AccesoActividad {
    public static void main(String[] args) {
        // Variables para representar el estado de la persona
        int edad = 20; 
        boolean inscripcionActiva = true;
        boolean documentoPresentado = false;

        // 1. Si la persona es mayor de edad
        boolean esMayorDeEdad = edad >= 18;
        
        // 2. Si cumple inscripción y documento
        boolean cumpleInscripcionYDocumento = inscripcionActiva && documentoPresentado;
        
        // 3. Si cumple los tres requisitos
        boolean cumpleLosTres = esMayorDeEdad && inscripcionActiva && documentoPresentado;

        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("¿Cumple inscripción y documento? " + cumpleInscripcionYDocumento);
        System.out.println("¿Cumple los tres requisitos? " + cumpleLosTres);
    }
}