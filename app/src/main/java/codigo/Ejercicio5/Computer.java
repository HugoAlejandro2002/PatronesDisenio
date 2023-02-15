package codigo.Ejercicio5;

public  class Computer {

    private String monitor;
    private String mouse;
    private String memoria;
    private String procesador;
    private String video;
    private String teclado;

    public Computer(){

    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public void showData(){
        System.out.println("monitor : "+monitor);
        System.out.println("teclado : "+teclado);
        System.out.println("mouse : "+mouse);
        System.out.println("memoria : "+memoria);
        System.out.println("procesador : "+procesador);
        System.out.println("video : "+video);
    }
}
