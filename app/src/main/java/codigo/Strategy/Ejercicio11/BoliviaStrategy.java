package codigo.Strategy.Ejercicio11;

public class BoliviaStrategy implements IStrategy {
    @Override
    public double change(double amount) {
        return amount / 6.96; // tasa de cambio Bolivianos a Dólares
    }
}
