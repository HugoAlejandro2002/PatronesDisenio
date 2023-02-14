package codigo.Ejercicio4;


public class FactoryBoletos {
    public static final String STANDART = "standart";
    public static final String INFANTIL = "infantil";
    public static final String SOLIDARIO = "solidario";
    public static IBoletos make (String type){
        IBoletos boleto;
        switch (type){
            case STANDART:
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

                boleto= new PasajeStandart();
                ((PasajeStandart)boleto).setAvion(avion);
                ((PasajeStandart)boleto).setPasajero(pasajero);
                ((PasajeStandart)boleto).setDestino(destino);
                ((PasajeStandart)boleto).setOrigen(origen);
                ((PasajeStandart)boleto).setCosto("300");
                ((PasajeStandart)boleto).setNumeroDeAsiento("1A");
                ((PasajeStandart)boleto).setNumeroVuelo(300);
                break;
            case INFANTIL:
                boleto = new PasajeInfantil();
            case SOLIDARIO:
                boleto = new PasajeSolidario();
            default:
                boleto = new PasajeStandart();
                break;
        }
        return boleto;
    }
}
