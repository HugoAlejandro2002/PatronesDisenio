package codigo.Proxy.Ejercicio13;


public class Main {
    public static void main(String[] args) {
        TarjetaDebito tarjeta = new TarjetaDebito(new Cuenta("union"), "888888","Mateo");
        tarjeta.accesoCuenta(120, "BS");
        tarjeta.accesoCuenta(700, "US");
        tarjeta.accesoCuenta(40,"Eur");
    }
}
