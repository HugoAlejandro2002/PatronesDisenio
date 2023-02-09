package codigo.Ejercicio1;

public class Tienda {
    public static void main(String[] args) throws InterruptedException {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Clientes cliente = new Clientes("jairo") ;
                cliente.log("Entra a la tienda");
            }
        });

    }
}
