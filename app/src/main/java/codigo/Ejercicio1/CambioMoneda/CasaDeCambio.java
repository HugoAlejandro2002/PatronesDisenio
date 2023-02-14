package codigo.Ejercicio1.CambioMoneda;

public class CasaDeCambio {

    public CasaDeCambio(){
        System.out.println("Inicializando CasaDeCambio");
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
