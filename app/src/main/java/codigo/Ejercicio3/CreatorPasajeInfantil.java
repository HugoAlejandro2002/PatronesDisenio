package codigo.Ejercicio3;

public class CreatorPasajeInfantil extends CreatorPasajes{


    @Override
    public PasajeInfantil create() {

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

        PasajeInfantil pasajeInfantil = new PasajeInfantil();
        pasajeInfantil.setAvion(avion);
        pasajeInfantil.setPasajero(pasajero);
        pasajeInfantil.setDestino(destino);
        pasajeInfantil.setOrigen(origen);
        pasajeInfantil.setCostoEspecial("200bs");
        pasajeInfantil.setNumeroDeAsiento("1A");
        pasajeInfantil.setNumeroVuelo(111);


        return pasajeInfantil;
    }
}
