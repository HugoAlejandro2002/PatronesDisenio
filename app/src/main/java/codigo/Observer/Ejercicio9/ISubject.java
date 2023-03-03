package codigo.Observer.Ejercicio9;

public interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers(String notificationType);
}
