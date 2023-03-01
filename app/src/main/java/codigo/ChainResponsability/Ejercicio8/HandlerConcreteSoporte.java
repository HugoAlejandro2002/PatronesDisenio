package codigo.ChainResponsability.Ejercicio8;

public class HandlerConcreteSoporte implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void criteriaHandler(Falla falla) {
        if (falla.getSeveridad() == 0) {
            System.out.println("La falla '" + falla.getTitulo() + "' será manejada por el equipo de Soporte");
        } else {
            System.out.println("No hay más handlers disponibles para atender la falla");
        }
    }
}
