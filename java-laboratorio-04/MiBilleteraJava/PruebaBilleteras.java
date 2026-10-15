public class PruebaBilleteras {
    public static void main(String[] args) {
        Billetera billetera1 = new Billetera("Kevin", 0);
        Billetera billetera2 = new Billetera("Laura", 0);

        // Registros en la primera
        billetera1.registrarIngreso(50000, "Salario");
        billetera1.registrarGasto(10000, "Transporte");

        // Registros en la segunda
        billetera2.registrarIngreso(100000, "Ventas");

        System.out.println("Billetera 1 (" + billetera1.getTitular() + "): Saldo $" + billetera1.getSaldo() + " | Movimientos: " + billetera1.getMovimientos().size());
        System.out.println("Billetera 2 (" + billetera2.getTitular() + "): Saldo $" + billetera2.getSaldo() + " | Movimientos: " + billetera2.getMovimientos().size());
    }
}