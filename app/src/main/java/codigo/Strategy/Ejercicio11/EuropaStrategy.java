package codigo.Strategy.Ejercicio11;

public class EuropaStrategy implements IStrategy {
    @Override
    public double change(double amount) {
        // lógica para cambiar de Euros a Dólares y/o Bolivianos
        return amount * 1.17; // tasa de cambio Euros a Dólares
    }
}
