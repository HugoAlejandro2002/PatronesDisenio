package codigo.Ejercicio1;

import java.io.*;

public class Logger {

    private String archivoTXT;
    private String directorio = System.getProperty("user.dir");
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

    public synchronized void log(String output){
        File archivo_txt = new File(directorio, archivoTXT);
        if(!archivo_txt.exists()){
            try{
                System.out.println("Archivo creado en: "+directorio);
                archivo_txt.createNewFile();
            } catch (IOException errorDeCreacionArchivo){
                System.out.println("Error: archivo no creado");
            }
        }
        try{
            FileWriter salida = new FileWriter(archivo_txt,true);
            salida.write((output+"\n").toCharArray());
            salida.close();
        }catch(IOException archivoInexistente){
            System.out.println("Error: no fue posible escribir en el archivo");
        }
    }
}

