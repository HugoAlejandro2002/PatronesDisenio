package codigo.Ejercicio1.CambioMoneda;


public class Empresa {
    private static Empresa tipoDeCambio = null ;

    private Empresa(){
        System.out.println("Inicializando tipo de cambio");
    }
    public static Empresa getCambio(){
        if( tipoDeCambio == null)
            tipoDeCambio = new Empresa();
        return tipoDeCambio;
    }
    public double convertToDollar(double amount, String currency){
        if(currency == "$")
            return amount;
        if(currency == "E")
            return amount*1.22;
        if(currency == "bs")
            return amount*6.96;
        return 0;
    }
    public double convertToBoliviano(double amount, String currency){
        if(currency == "$")
            return amount/6.96;
        if(currency == "E")
            return amount/8.41;
        if(currency == "bs")
            return amount;
        return 0;

    }
    public double convertToEuro(double amount, String currency){
        if(currency == "$")
            return amount*0.93;
        if(currency == "E")
            return amount;
        if(currency == "bs")
            return amount*8.41;
        return 0;

    }
}
