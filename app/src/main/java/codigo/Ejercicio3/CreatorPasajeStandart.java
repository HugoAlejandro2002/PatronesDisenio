package codigo.Ejercicio3;

public class CreatorPasajeStandart extends CreatorPasajes{


    @Override
    public PasajeStandart create() {

        Avion avion = new Avion();
        avion.setCapacidad(500);
        avion.setMarca("ford");
        avion.setModelo("Boeing730");
        avion.setNumeroAsientos(200);

        Pasajero pasajero = new Pasajero();
        pasajero.setCi(0000);
        pasajero.setNombre("-----");

        Origen origen = new Origen();
        origen.setAereopuertoOrigen("ABol");
        origen.setCiudadOrigen("La Paz");
        origen.setPaisOrigen("Bolivia");

        Destino destino = new Destino();
        destino.setAereopuertoDestino("AItal");
        destino.setCiudadDestino("Roma");
        destino.setPaisDestino("Italia");

        PasajeStandart pasajeStandart = new PasajeStandart();
        pasajeStandart.setAvion(avion);
        pasajeStandart.setPasajero(pasajero);
        pasajeStandart.setDestino(destino);
        pasajeStandart.setOrigen(origen);
        pasajeStandart.setCosto("300bs");
        pasajeStandart.setNumeroDeAsiento("1A");
        pasajeStandart.setNumeroVuelo(111);


        return pasajeStandart;
    }
}
