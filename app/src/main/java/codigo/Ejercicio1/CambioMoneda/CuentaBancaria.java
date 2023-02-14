package codigo.Ejercicio1.CambioMoneda;

public class CuentaBancaria {
    private static CuentaBancaria instance = null;
    double saldoCuenta = 0 ;

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

    public synchronized void depositarDinero(double amount){
        System.out.println("Se deposito: "+ amount);
        saldoCuenta+=amount;
    }

    public void printSaldoCuenta(){
        System.out.println("El saldo de la cuenta es: "+ saldoCuenta);
    }
}
