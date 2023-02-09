package codigo.Ejercicio1;

public class Clientes {
    public String name;

    public Clientes(String name){
        this.name = name;
    }


    public void log(String message){
        Logger.getInstance().log("El cliente "+name+" "+message);
    }

}
