package codigo.Composite.Ejercicio14;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("DELL-1", 100, generarRandom());
        Producto p2 = new Producto("DELL-2", 100, generarRandom());
        Producto p3 = new Producto("DEll-3", 100, generarRandom());

        Producto p4 = new Producto("LENOVO-1", 100, generarRandom());
        Producto p5 = new Producto("LENOVO-2", 100, generarRandom());
        Producto p6 = new Producto("LENOVO-3", 100, generarRandom());
        Producto p7 = new Producto("LENOVO-4", 100, generarRandom());

        Laboratorio laboratorio1 = new Laboratorio(null, 0, 0);
        laboratorio1.setNombreLaboratorio("Laboratorio 1");
        laboratorio1.add(p1);
        laboratorio1.add(p2);
        laboratorio1.add(p3);

        Laboratorio laboratorio2 = new Laboratorio(null, 0, 0);
        laboratorio2.setNombreLaboratorio("Laboratorio 2");
        laboratorio2.add(p4);
        laboratorio2.add(p5);
        laboratorio2.add(p6);
        laboratorio2.add(p7);
    
        ContenedorComputadora contenedor1 = 
        new ContenedorComputadora(null, 0, 0);
        contenedor1.setNombreContenedor("Contedenor - 1");
        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);
        contenedor1.operation();
    }

    public static int generarRandom(){
        return (int)(Math.random()*10);
    }
}