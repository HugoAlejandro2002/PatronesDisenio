package codigo.ExamenFilaA.Ejercicio2;


public interface IChat {
    void send(String message, Estudiante estudiante, String indicador);
    void send(String message, Docente docente);
    void send(String message, Administrativo admin);
}
