package codigo.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> accesorios = new ArrayList<String>();
        accesorios.add("Audífono");
        accesorios.add("Cargador");
        accesorios.add("Estuche");
    
        Sim sim = new Sim("Empresa Tel", "1234567890");
    
        SamsungR10 modelo = new SamsungR10("5.5 pulgadas", "Octa-Core", "2GB", sim, "Android 11", "16 MP", "5.0", 2, "30 horas", accesorios);
    
        List<SamsungR10> listaDeCelulares = new ArrayList<SamsungR10>();
        for (int i = 0; i < 5; i++) {
          listaDeCelulares.add(modelo.clone());
        }

        for (SamsungR10 celular : listaDeCelulares) {
                celular.mostrarDatos();
          }
      
    }
}
