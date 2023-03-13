package codigo.ExamenFilaA.Ejercicio1;


public class Main {
    public static void main(String[] args) {
        Backups backup = new Backups();
        Editor writer = new Editor();

        Archivo a = new Archivo();
        a.setTitulo("hola");

        a.addOracion("hola");
        writer.setMemento(a);

        backup.addNuevaVersion(writer.createMemento());

        a.addOracion("hola");
        writer.setMemento(a);

        backup.addNuevaVersion(writer.createMemento());

        a.addOracion("no");
        writer.setMemento(a);

        backup.addNuevaVersion(writer.createMemento());

        a.addOracion("siiiii");
        writer.setMemento(a);

        backup.addNuevaVersion(writer.createMemento());

        a = writer.recuperarVersion(backup.getVersionAnterior());
        a.show();
        a = writer.recuperarVersion(backup.getVersionAnterior());
        a.show();
        a = writer.recuperarVersion(backup.getVersionAnterior());
        a.show();
        a = writer.recuperarVersion(backup.getVersionAnterior());
        a.show();
        a = writer.recuperarVersion(backup.getVersionAnterior());
        a.show();

        a = writer.recuperarVersion(backup.getVersionSiguiente());
        a.show();
        a = writer.recuperarVersion(backup.getVersionSiguiente());
        a.show();
        a = writer.recuperarVersion(backup.getVersionSiguiente());
        a.show();
        a = writer.recuperarVersion(backup.getVersionSiguiente());
        a.show();
        
    }
}
