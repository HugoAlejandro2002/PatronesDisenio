package codigo.Ejercicio4;

public class Destino {
    private String ciudadDestino;
    private String paisDestino;
    private String aereopuertoDestino;

    public Destino(){}

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getAereopuertoDestino() {
        return aereopuertoDestino;
    }

    public void setAereopuertoDestino(String aereopuertoDestino) {
        this.aereopuertoDestino = aereopuertoDestino;
    }

    public void showInfo(){
        System.out.println("CiudadDestino: " + ciudadDestino);
        System.out.println("PaisDestino: "+paisDestino);
        System.out.println("AereopuertoDestino: " +  aereopuertoDestino);

    }
}
