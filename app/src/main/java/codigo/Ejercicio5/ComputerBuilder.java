package codigo.Ejercicio5;


public abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createComputer(){
        computer = new Computer();
    }

    public abstract void buildMonitor();
    public abstract void buildMouse();
    public abstract void buildMemoria();
    public abstract void buildProcesador();
    public abstract void buildVideo();
    public abstract void buildTeclado();
}
