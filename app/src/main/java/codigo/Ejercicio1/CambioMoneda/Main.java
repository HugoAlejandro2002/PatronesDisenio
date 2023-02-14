package codigo.Ejercicio1.CambioMoneda;



public class Main {
    public static void main(String []args) throws InterruptedException {

        Thread lc = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista librecambista = new LibreCambista();
                System.out.println("Converting 10 bolivians into dollars " + librecambista.exchangeBolivianos(10, "$"));
                librecambista.depositarDinero(librecambista.exchangeDollars(librecambista.exchangeBolivianos(10, "$"), "$"));
                System.out.println("Converting 70 dollars into bolivians " + librecambista.exchangeDollars(70, "bs"));
                librecambista.depositarDinero(librecambista.exchangeBolivianos(librecambista.exchangeDollars(70, "bs"), "bs"));
                System.out.println("Converting 1 E into bolivians " + librecambista.exchangeEuros(1, "bs"));
                librecambista.depositarDinero(librecambista.exchangeBolivianos(librecambista.exchangeEuros(1, "bs"), "bs"));
            }
        });

        Thread cc = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaDeCambio casacambio = new CasaDeCambio();
                System.out.println("Converting 10 bolivians into dollars " + casacambio.exchangeBolivianos(10, "$"));
                casacambio.depositarDinero(casacambio.exchangeDollars(casacambio.exchangeBolivianos(10, "$"), "$"));
                System.out.println("Converting 70 dollars into bolivians " + casacambio.exchangeDollars(70, "bs"));
                casacambio.depositarDinero(casacambio.exchangeBolivianos(casacambio.exchangeDollars(70, "bs"), "bs"));
                System.out.println("Converting 1 E into bolivians " + casacambio.exchangeEuros(1, "bs"));
                casacambio.depositarDinero(casacambio.exchangeBolivianos(casacambio.exchangeEuros(1, "bs"), "bs"));
            }
        });

        Thread banco = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco();
                System.out.println("Converting 10 bolivians into dollars " + banco.exchangeBolivianos(10, "$"));
                banco.depositarDinero(banco.exchangeDollars(banco.exchangeBolivianos(10, "$"), "$"));
                System.out.println("Converting 70 dollars into bolivians " + banco.exchangeDollars(70, "bs"));
                banco.depositarDinero(banco.exchangeBolivianos(banco.exchangeDollars(70, "bs"), "bs"));
                System.out.println("Converting 1 E into bolivians " + banco.exchangeEuros(1, "bs"));
                banco.depositarDinero(banco.exchangeBolivianos(banco.exchangeEuros(1, "bs"), "bs"));
            }
        });


        lc.start();
        cc.start();
        banco.start();
        Thread.sleep(2000);
        CuentaBancaria.getInstance().printSaldoCuenta();;
    }

}
