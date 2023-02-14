package codigo.Ejercicio4;



public class Main {
    public static void main(String[]args){
        PasajeStandart boleto1 = (PasajeStandart) FactoryBoletos.make(FactoryBoletos.STANDART);
        boleto1.setPasajero(new Pasajero("Ander", 12345));
        boleto1.setNumeroDeAsiento("!ASDDF");
        boleto1.create();


    }
}
