package codigo.Ejercicio1.CambioMoneda;



public class Main {
    public static void main(String []args) throws InterruptedException {

        Thread lc = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista librecambista = new LibreCambista();
                System.out.println("Converting 23 bs into" + librecambista.exchangeBolivianos(10, "$"));
                System.out.println("Converting 23 bs into" + librecambista.exchangeDollars(70, "bs"));
                System.out.println("Converting 23 bs into" + librecambista.exchangeEuros(1, "bs"));
            }
        });

        Thread cc = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaDeCambio casacambio = new CasaDeCambio();
                System.out.println("Converting 23 bs into" + casacambio.exchangeBolivianos(10, "$"));
                System.out.println("Converting 23 bs into" + casacambio.exchangeDollars(70, "bs"));
                System.out.println("Converting 23 bs into" + casacambio.exchangeEuros(1, "bs"));
            }
        });

        Thread banco = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco();
                System.out.println("Converting 23 bs into" + banco.exchangeBolivianos(10, "$"));
                System.out.println("Converting 23 bs into" + banco.exchangeDollars(70, "bs"));
                System.out.println("Converting 23 bs into" + banco.exchangeEuros(1, "bs"));
                 }
        });


        lc.start();
        cc.start();
        banco.start();
        Thread.sleep(2000);
    }

}
