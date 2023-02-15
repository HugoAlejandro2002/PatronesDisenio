package codigo.Ejercicio5;



public class I5Bajo extends ComputerBuilder{
    @Override
    public void buildMonitor() {
        computer.setMonitor("24");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("normal");
    }

    @Override
    public void buildMemoria() {
        computer.setMemoria("8gb");
    }

    @Override
    public void buildProcesador() {
        computer.setProcesador("i5");
    }

    @Override
    public void buildVideo() {
        computer.setVideo("4");
    }

    @Override
    public void buildTeclado() {
        computer.setTeclado("normal");
    }
}
