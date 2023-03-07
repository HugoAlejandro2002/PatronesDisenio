package codigo.Strategy.Ejercicio11;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public double change(double amount) {
        return strategy.change(amount);
    }
}
