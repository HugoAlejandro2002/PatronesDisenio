package codigo.State.Ejercicio10;

import java.util.Arrays;

public class Apagado implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) {

        System.out.println("Entrando al estado: APAGADO...");
        Arrays.fill(computadora.getProgramasAbiertos(), null);
        computadora.getCpu().setConsumo(0);
        computadora.getMemoriaRam().setConsumo(0);

        System.out.println("Transición al estado: APAGADO finalizada");
        System.out.println();



    }
}
