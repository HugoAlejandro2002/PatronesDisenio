package codigo.Ejercicio1;

public class Productos {
    
    public String name;

    public Productos(String name){
        this.name = name;
    }

    public void log(String message){
        Logger.getInstance().log(message);
    }

    public String compra(Clientes cliente){
        
        return "El producto "+name+" es comprado por "+cliente.name;
    }
}

