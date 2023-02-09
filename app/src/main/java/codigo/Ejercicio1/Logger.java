package codigo.Ejercicio1;

public class Logger {

    private static Logger instance = null;

    private Logger(){
        System.out.println("Creacion deberia mostrarse 1 sola vez  SINGLETON 3");
    }

    private synchronized static void create(){
        if (instance == null){
            instance = new Logger();
        }
    }


    // global access
    public static Logger getInstance(){
        if (instance == null){
            create();
        }
        return instance;
    }

    public synchronized void log(int amount){
        
    }
}

