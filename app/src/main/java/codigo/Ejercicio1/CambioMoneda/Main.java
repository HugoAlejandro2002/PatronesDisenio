package codigo.Ejercicio1.CambioMoneda;



public class Main {
    public static void main(String []args){
        LibreCambista librecambista = new LibreCambista();
        System.out.println("Converting 23 bs into" + librecambista.exchangeBolivianos(10, "$"));
        System.out.println("Converting 23 bs into" + librecambista.exchangeDollars(70, "bs"));
        System.out.println("Converting 23 bs into" + librecambista.exchangeEuros(1, "bs"));

        CasaDeCambio casacambio = new CasaDeCambio();
        System.out.println("Converting 23 bs into" + casacambio.exchangeBolivianos(10, "$"));
        System.out.println("Converting 23 bs into" + casacambio.exchangeDollars(70, "bs"));
        System.out.println("Converting 23 bs into" + casacambio.exchangeEuros(1, "bs"));

        Banco banco = new Banco();
        System.out.println("Converting 23 bs into" + banco.exchangeBolivianos(10, "$"));
        System.out.println("Converting 23 bs into" + banco.exchangeDollars(70, "bs"));
        System.out.println("Converting 23 bs into" + banco.exchangeEuros(1, "bs"));

    }

}
