package codigo.ChainResponsability.Ejercicio8;

public class HandlerManager implements IHandler {
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
        HandlerConcreteDev handlerDev = new HandlerConcreteDev();
        this.setNext(handlerDev);
        HandlerConcreteQA handlerQA = new HandlerConcreteQA();
        handlerDev.setNext(handlerQA);
        HandlerConcretePO handlerPO = new HandlerConcretePO();
        handlerQA.setNext(handlerPO);
        HandlerConcreteSoporte handlerSoporte = new HandlerConcreteSoporte();
        handlerPO.setNext(handlerSoporte);
        this.next.criteriaHandler(falla);
    }
}
