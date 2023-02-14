package codigo.Ejercicio1.CambioMoneda;


public class LibreCambista {

    public LibreCambista(){
        System.out.println("Inicializando LibreCambista");
    }
    public double exchangeBolivianos(int amount, String type){
        return Empresa.getCambio().convertToBoliviano(amount, type);
    }
    public double exchangeDollars(int amount, String type){
        return Empresa.getCambio().convertToDollar(amount, type);
    }
    public double exchangeEuros(int amount, String type){
        return Empresa.getCambio().convertToEuro(amount, type);
    }

    public void depositarDinero(double amount){
        CuentaBancaria.getInstance().depositarDinero(amount);
    }
}
