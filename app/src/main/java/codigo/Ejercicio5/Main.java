package codigo.Ejercicio5;



public class Main {
    public static void main (String[]args){
        Dueno dueno =new Dueno();
        I9Alto com9 = new I9Alto();
        I5Bajo com5 = new I5Bajo();
        I7Medio com7 = new I7Medio();

        dueno.setComputerBuilder(com9);
        dueno.builComputer();
        Computer computer9 = dueno.getComputer();
        computer9.showData();

        dueno.setComputerBuilder(com5);
        dueno.builComputer();
        Computer computer5 = dueno.getComputer();
        computer5.showData();

        dueno.setComputerBuilder(com7);
        dueno.builComputer();
        Computer computer7 = dueno.getComputer();
        computer7.showData();
    }
}
