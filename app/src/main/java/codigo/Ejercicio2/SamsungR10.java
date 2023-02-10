package codigo.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class SamsungR10 implements ITelefono {
    private String tamano;
    private String cpu;
    private String memory;
    private Sim sim;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private int cantidadDeMemoriasExternas;
    private String tiempoUsoBateria;
    private List<String> accesorios = new ArrayList<String>();

    public SamsungR10(String tamano, String cpu, String memory, Sim sim, String versionAndroid, String camara,
        String bluetooth, int cantidadDeMemoriasExternas, String tiempoUsoBateria, List<String> accesorios) {
        this.tamano = tamano;
        this.cpu = cpu;
        this.memory = memory;
        this.sim = sim;
        this.versionAndroid = versionAndroid;
        this.camara = camara;
        this.bluetooth = bluetooth;
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
        this.tiempoUsoBateria = tiempoUsoBateria;
        this.accesorios = accesorios;
    }

    public SamsungR10(){}

    public String getTamano() {
        return tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public Sim getSim() {
        return sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public String getTiempoUsoBateria() {
        return tiempoUsoBateria;
    }

    public List<String> getAccesorios() {
        return accesorios;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public void setSim(Sim sim) {
        this.sim = sim;
    }
    
    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }
    
    public void setCamara(String camara) {
        this.camara = camara;
    }
    
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    
    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }
    
    public void setTiempoUsoBateria(String tiempoUsoBateria) {
        this.tiempoUsoBateria = tiempoUsoBateria;
    }
    
    public void setAccesorios(List<String> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public SamsungR10 clone() {
        SamsungR10 clone = new SamsungR10();

        clone.setTamano(this.tamano);
        clone.setCpu(this.cpu);
        clone.setMemory(this.memory);
        clone.setSim(this.sim);
        clone.setVersionAndroid(this.versionAndroid);
        clone.setCamara(this.camara);
        clone.setBluetooth(this.bluetooth);
        clone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
        clone.setTiempoUsoBateria (this.tiempoUsoBateria);
        clone.setAccesorios( this.getAccesorios());

        return clone;

    }

}