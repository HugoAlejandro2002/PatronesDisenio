package codigo.Ejercicio5;

public class I9Alto extends ComputerBuilder{
    @Override
    public void buildMonitor() {
        computer.setMonitor("45");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("gamer");
    }

    @Override
    public void buildMemoria() {
        computer.setMemoria("32gb");
    }

    @Override
    public void buildProcesador() {
        computer.setProcesador("i9");
    }

    @Override
    public void buildVideo() {
        computer.setVideo("16");
    }

    @Override
    public void buildTeclado() {
        computer.setTeclado("luminoso");
    }
}
