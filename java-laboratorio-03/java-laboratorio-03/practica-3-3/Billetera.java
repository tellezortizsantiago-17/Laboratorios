public class Billetera {

    private String titular;
    private double saldo;

    public Billetera(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean registrarIngreso(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean registrarGasto(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}