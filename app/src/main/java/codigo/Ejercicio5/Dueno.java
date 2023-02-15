package codigo.Ejercicio5;




public class Dueno {
    private ComputerBuilder computerBuilder;

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void builComputer(){
        this.computerBuilder.createComputer();
        this.computerBuilder.buildMemoria();
        this.computerBuilder.buildMonitor();
        this.computerBuilder.buildMouse();
        this.computerBuilder.buildProcesador();
        this.computerBuilder.buildTeclado();
        this.computerBuilder.buildVideo();

    }
}
