package codigo.Ejercicio3;

public class PasajeStandart implements IPasaje{

    private int numeroVuelo;
    private Destino destino;
    private Origen  origen;
    private Avion   avion;
    private Pasajero pasajero;
    private String  numeroDeAsiento;
    private String  costo;

    public PasajeStandart(){
        destino = new Destino();
        origen = new Origen();
        avion = new Avion();
        pasajero = new Pasajero();
    }


    @Override
    public void showInfo() {
        System.out.println();
        System.out.println("Numero de vuelo: " + numeroVuelo);
        System.out.println("Numero de asiento: " + numeroDeAsiento);
        System.out.println("Costo: " + costo);
        origen.showInfo();
        destino.showInfo();
        avion.showInfo();
        pasajero.showInfo();

    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(String numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
