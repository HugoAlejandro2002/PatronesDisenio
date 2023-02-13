package codigo.Ejercicio3;

public class Avion {
    private String  marca;
    private int     capacidad;
    private String  modelo;
    private int     numeroAsientos;

    public Avion(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void showInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Modelo: " + modelo);
        System.out.println("NumeroAsiento: " + numeroAsientos);
    }
}
