package codigo.Ejercicio1.CambioMoneda;

public class CuentaBancaria {
    private static CuentaBancaria instance = null;

    //2) constructor private
    private CuentaBancaria(){
        System.out.println("Se crea la cuenta");
    }

    private synchronized static void create(){
        if (instance == null){
            instance = new CuentaBancaria();
        }
    }


    // global access
    public static CuentaBancaria getInstance(){
        if (instance == null){
            create();
        }
        return instance;
    }

    public synchronized void retirarDinero(double amount){
        System.out.println("Se deposito: "+ amount);
    }
}
