package codigo.State.Ejercicio10;


import java.util.Arrays;

public class Reiniciar implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) {

        System.out.println("Entrando al estado: REINICIAR...");
        Arrays.fill(computadora.getProgramasAbiertos(), null);
        computadora.getCpu().setConsumo(0);
        computadora.getMemoriaRam().setConsumo(0);

        System.out.println("Transición al estado: REINICIAR finalizada");
        System.out.println();



    }
}
