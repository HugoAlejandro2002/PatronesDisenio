package codigo.Observer.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de la compañía telefónica
        TelecomCompany telecomCompany = new TelecomCompany();

        // Creamos dos clientes y los agregamos a la lista de observadores de la compañía telefónica
        Customer pedro = new Customer("Pedro", new String[]{"promociones", "premios"});
        Customer maria = new Customer("Maria", new String[]{"noticias"});
        Customer eynar = new Customer("Eynar", new String[]{"precios llamadas", "promociones", "premios", "noticias"});

        telecomCompany.attach(pedro);
        telecomCompany.attach(maria);
        telecomCompany.attach(eynar);

        telecomCompany.setNotification("promociones", "Nuevas promociones disponibles");
        telecomCompany.setNotification("noticias", "Nueva noticia disponible");
        telecomCompany.setNotification("precios llamadas", "Nuevos precios de llamadas");
        telecomCompany.setNotification("premios", "Nuevos premios disponibles");

        telecomCompany.detach(pedro);
        telecomCompany.setNotification("promociones", "Más promociones disponibles");
    }
}

