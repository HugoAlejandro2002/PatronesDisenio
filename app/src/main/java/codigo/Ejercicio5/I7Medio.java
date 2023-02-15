package codigo.Ejercicio5;


public class I7Medio extends ComputerBuilder{
    @Override
    public void buildMonitor() {
        computer.setMonitor("32");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("luminoso");
    }

    @Override
    public void buildMemoria() {
        computer.setMemoria("16gb");
    }

    @Override
    public void buildProcesador() {
        computer.setProcesador("i7");
    }

    @Override
    public void buildVideo() {
        computer.setVideo("8");
    }

    @Override
    public void buildTeclado() {
        computer.setTeclado("luminoso");
    }
}
