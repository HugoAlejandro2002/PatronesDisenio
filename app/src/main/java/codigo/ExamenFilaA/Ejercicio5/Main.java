package codigo.ExamenFilaA.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Celular celu = new Celular();

        celu.setState(new Apagado());
        celu.accionar();
        celu.setState(new Prendiendo());
        celu.accionar();
        celu.setState(new Reiniciado());
        celu.accionar();
        celu.setState(new Prendiendo());
        celu.accionar();
    }
}
