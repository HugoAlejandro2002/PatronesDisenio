package codigo.ChainResponsability.Ejercicio8;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    // criterio para manejar el problema
    void criteriaHandler(Falla falla);
}