package codigo.ChainResponsability.Ejercicio8;

public class HandlerConcretePO implements IHandler {
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
        if (falla.getSeveridad() == 1) {
            System.out.println("La falla '" + falla.getTitulo() + "' será manejada por el equipo de PO.");
        } else {
            next.criteriaHandler(falla);
        }
    }
}