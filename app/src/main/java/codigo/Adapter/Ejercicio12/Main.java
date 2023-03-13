package codigo.Adapter.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        IAplicacion2 appweb = new AppWeb();
        appweb.iniciarSesion();
        appweb.cerrarSesion();
        appweb.generacionDeDatos();

        AplicacionAdapter adapter = new AplicacionAdapter(new AppAndroid());
        adapter.iniciarSesion();
        adapter.cerrarSesion();
        adapter.generacionDeDatos();
    }
}
