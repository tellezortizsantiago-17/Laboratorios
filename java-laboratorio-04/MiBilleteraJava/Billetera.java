import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Billetera {
    private String titular;
    private double saldo;
    private int cantidadIngresos;
    private double totalIngresos;
    private int cantidadGastos;
    private double totalGastos;
    
    // Lista para el historial
    private List<Movimiento> movimientos;

    public Billetera(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
        this.movimientos = new ArrayList<>();
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public int getCantidadIngresos() { return cantidadIngresos; }
    public double getTotalIngresos() { return totalIngresos; }
    public int getCantidadGastos() { return cantidadGastos; }
    public double getTotalGastos() { return totalGastos; }

    public boolean registrarIngreso(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0 || categoria == null || categoria.trim().isEmpty()) {
            return false;
        }
        movimientos.add(new Movimiento("INGRESO", categoria, valor));
        saldo += valor;
        totalIngresos += valor;
        cantidadIngresos++;
        return true;
    }

    public boolean registrarGasto(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0 || categoria == null || categoria.trim().isEmpty() || valor > saldo) {
            return false;
        }
        movimientos.add(new Movimiento("GASTO", categoria, valor));
        saldo -= valor;
        totalGastos += valor;
        cantidadGastos++;
        return true;
    }

    // Devuelve una copia superficial para proteger la lista original
    public List<Movimiento> getMovimientos() {
        return new ArrayList<>(movimientos);
    }

    public List<Movimiento> buscarPorTipo(String tipo) {
        List<Movimiento> encontrados = new ArrayList<>();
        for (Movimiento m : movimientos) {
            if (m.getTipo().equalsIgnoreCase(tipo)) {
                encontrados.add(m);
            }
        }
        return encontrados;
    }

    // Uso de Set (HashSet) para categorías únicas sin repetir
    public Set<String> categoriasUtilizadas() {
        Set<String> categorias = new HashSet<>();
        for (Movimiento m : movimientos) {
            categorias.add(m.getCategoria());
        }
        return categorias;
    }

    // Uso de Map (HashMap) para sumar gastos por categoría
    public Map<String, Double> gastosPorCategoria() {
        Map<String, Double> totales = new HashMap<>();
        for (Movimiento m : movimientos) {
            if (m.getTipo().equals("GASTO")) {
                double acumulado = totales.getOrDefault(m.getCategoria(), 0.0);
                totales.put(m.getCategoria(), acumulado + m.getValor());
            }
        }
        return totales;
    }
}