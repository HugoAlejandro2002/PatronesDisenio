package codigo.State.Ejercicio10;

import java.util.Random;

public class Prendido implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) throws InterruptedException {

        System.out.println("Entrando al estado: PRENDIDO...");

        int randomNumberOfPrograms = new Random().nextInt(10-1) +1; //Hasta 10, ya que el arreglo es de tamaño 10 por defecto

        for(int i = 0; i<randomNumberOfPrograms; i++) {

            computadora.getProgramasAbiertos()[i] = new Programa("Programa " + (i+1));

        }

        System.out.println("Numero de programas encendidos: " + randomNumberOfPrograms);


        int aumentoDeRecursos = randomNumberOfPrograms*5;

        System.out.println("Por esto, se consume un "+aumentoDeRecursos+"%");

        while(computadora.getCpu().getConsumo() < 100 && computadora.getMemoriaRam().getConsumo() < 100) {

            computadora.getCpu().showInfo();
            computadora.getMemoriaRam().showInfo();

            Thread.sleep(5000);

            computadora.getCpu().setConsumo(computadora.getCpu().getConsumo()+aumentoDeRecursos);
            computadora.getMemoriaRam().setConsumo(computadora.getMemoriaRam().getConsumo()+aumentoDeRecursos);

        }

        computadora.getCpu().setConsumo(100);
        computadora.getMemoriaRam().setConsumo(100);

        computadora.getCpu().showInfo();
        computadora.getMemoriaRam().showInfo();


        System.out.println("Transición al estado: PRENDIDO finalizada");
        System.out.println();



    }
}
