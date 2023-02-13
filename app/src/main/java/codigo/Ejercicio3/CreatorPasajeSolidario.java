package codigo.Ejercicio3;

public class CreatorPasajeSolidario extends CreatorPasajes{


    @Override
    public PasajeSolidario create() {

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

        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setPasajero(pasajero);
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setCosto("300bs");
        pasajeSolidario.setNumeroDeAsiento("1A");
        pasajeSolidario.setNumeroVuelo(111);
        pasajeSolidario.setDescuento("20%");
        pasajeSolidario.setMotivoDescuento("Embarazo");


        return pasajeSolidario;
    }
}
