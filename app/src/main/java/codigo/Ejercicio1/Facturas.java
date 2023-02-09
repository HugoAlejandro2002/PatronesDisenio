package codigo.Ejercicio1;

public class Facturas {
    
    private Clientes cliente;
    private Productos producto;

    
    
    public void log(){
        Logger.getInstance().log(cliente.name+" compra "+producto.name);
    }
}
