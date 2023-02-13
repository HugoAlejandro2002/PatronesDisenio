package codigo.Ejercicio3;
public class Origen {
    private String ciudadOrigen;
    private String paisOrigen;
    private String aereopuertoOrigen;

    public Origen(){}

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getAereopuertoOrigen() {
        return aereopuertoOrigen;
    }

    public void setAereopuertoOrigen(String aereopuertoOrigen) {
        this.aereopuertoOrigen = aereopuertoOrigen;
    }

    public void showInfo(){
        System.out.println("CiudadOrigen: " + ciudadOrigen);
        System.out.println("PaisOrigen: "+ paisOrigen);
        System.out.println("AereopuertoOrigen: " + aereopuertoOrigen);

    }
}
