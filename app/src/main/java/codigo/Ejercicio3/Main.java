package codigo.Ejercicio3;

public class Main {
    public static void main(String[]args){
        PasajeStandart pasajeSt1 = new CreatorPasajeStandart().create();
        pasajeSt1.setPasajero(new Pasajero("Andersaurio", 114));
        pasajeSt1.setNumeroDeAsiento("1A");
        pasajeSt1.showInfo();

        PasajeStandart pasajeSt2 = new CreatorPasajeStandart().create();
        pasajeSt2.setPasajero(new Pasajero("Andersaurio Dormido 2", 215));
        pasajeSt2.setNumeroDeAsiento("1B");
        pasajeSt2.showInfo();

        PasajeSolidario pasajeSol1 = new CreatorPasajeSolidario().create();
        pasajeSol1.setPasajero(new Pasajero("Andersaurio despierto 3", 303));
        pasajeSol1.setNumeroDeAsiento("2A");
        pasajeSol1.showInfo();

        PasajeSolidario pasajeSol2 = new CreatorPasajeSolidario().create();
        pasajeSol2.setPasajero(new Pasajero("Ubbbdewen Osas", 504));
        pasajeSol2.setNumeroDeAsiento("2B");
        pasajeSol2.showInfo();

        PasajeInfantil pasajeInf1 = new CreatorPasajeInfantil().create();
        pasajeInf1.setPasajero(new Pasajero("Hugo No durmio bien", 501));
        pasajeInf1.setNumeroDeAsiento("3A");
        pasajeInf1.showInfo();

        PasajeInfantil pasajeInf2 = new CreatorPasajeInfantil().create();
        pasajeInf2.setPasajero(new Pasajero("Saul Rodrigo", 608));
        pasajeInf2.setNumeroDeAsiento("3B");
        pasajeInf2.showInfo();
    }
}
