package codigo.Strategy.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new BoliviaStrategy());
        double amount = 1000.0;

        System.out.println("Cambiando " + amount + " Bolivianos a Dólares: " + context.change(amount));

        context.setStrategy(new EuropaStrategy());
        System.out.println("Cambiando " + amount + " Euros a Dólares: " + context.change(amount));

        context.setStrategy(new EEUUStrategy());
        System.out.println("Cambiando " + amount + " Dólares a Euros: " + context.change(amount));
    }
}
