package codigo.Proxy.Ejercicio13;

public class Cuenta implements IBanco{
    private String id;
    private double saldo;
    

    public Cuenta(String id) {
        this.id = id;
        saldo = 1000;
    }



    @Override
    public void accesoCuenta(double monto, String moneda) {
        System.out.println("Acceso a la cuenta: "+id);
        System.out.println("Sacando: "+monto+" BS");
        System.out.println("Saldo actual: "+saldo);
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
