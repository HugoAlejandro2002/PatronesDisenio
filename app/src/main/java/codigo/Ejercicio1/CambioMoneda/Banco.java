package codigo.Ejercicio1.CambioMoneda;

public class Banco {

    public Banco(){
        System.out.println("Inicializando Banco");
    }
    public double exchangeBolivianos(double amount, String type){
        return Empresa.getCambio().convertToBoliviano(amount, type);
    }
    public double exchangeDollars(double amount, String type){
        return Empresa.getCambio().convertToDollar(amount, type);
    }
    public double exchangeEuros(double amount, String type){
        return Empresa.getCambio().convertToEuro(amount, type);
    }

    public void depositarDinero(double amount){
        CuentaBancaria.getInstance().depositarDinero(amount);
    }
}
