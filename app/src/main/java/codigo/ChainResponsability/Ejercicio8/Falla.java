package codigo.ChainResponsability.Ejercicio8;

public class Falla {
    private String titulo;
    private String descripcion;
    private int severidad;

    public Falla(String titulo, String descripcion, int severidad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.severidad = severidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getSeveridad() {
        return severidad;
    }
}
