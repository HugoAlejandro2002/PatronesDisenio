package codigo.Strategy.Ejercicio11;

public class EEUUStrategy implements IStrategy {
    @Override
    public double change(double amount) {
        // lógica para cambiar de Dólares a Euros y/o Bolivianos
        return amount * 0.85; // tasa de cambio Dólares a Euros
    }
}

