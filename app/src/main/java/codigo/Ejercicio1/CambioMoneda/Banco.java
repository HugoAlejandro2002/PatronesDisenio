package codigo.Ejercicio1.CambioMoneda;

public class Banco {

    public Banco(){
        System.out.println("Inicializando Banco");
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
}
