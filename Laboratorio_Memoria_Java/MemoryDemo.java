class PetProfile {
    String name;
    public PetProfile(String name) { this.name = name; }
}

public class MemoryDemo {
    public static void main(String[] args) {
        // 1. MICROEJERCICIO
        int[] values = {3, 6};
        int[] other = values;
        other[1] = 9;
        
        System.out.println("Valor en values[1]: " + values[1]); 
        System.out.println("¿Misma referencia?: " + (values == other)); 

        // 2. DEMOSTRACIÓN DE PASO POR VALOR
        PetProfile myPet = new PetProfile("Fido");
        System.out.println("Nombre original: " + myPet.name);
        
        modificarMascota(myPet);
        System.out.println("Nombre después: " + myPet.name);
    }

    public static void modificarMascota(PetProfile petParam) {
        petParam.name = "Max";
        petParam = new PetProfile("Firulais");
    }
}