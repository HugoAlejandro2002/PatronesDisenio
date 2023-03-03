package codigo.Observer.Ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelecomCompany implements ISubject {

    private Map<String, List<IObserver>> observers = new HashMap<>();
    private Map<String, String> notifications = new HashMap<>();

    public void setNotification(String notificationType, String notification) {
        notifications.put(notificationType, notification);
        notifyObservers(notificationType);
    }

    @Override
    public void attach(IObserver observer) {
        String[] notificationTypes = ((Customer) observer).getNotificationTypes();
        for (String type : notificationTypes) {
            List<IObserver> observerList = observers.get(type);
            if (observerList == null) {
                observerList = new ArrayList<>();
                observers.put(type, observerList);
            }
            observerList.add(observer);
        }
    }

    @Override
    public void detach(IObserver observer) {
        String[] notificationTypes = ((Customer) observer).getNotificationTypes();
        for (String type : notificationTypes) {
            List<IObserver> observerList = observers.get(type);
            if (observerList != null) {
                observerList.remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers(String notificationType) {
        List<IObserver> observerList = observers.get(notificationType);
        if (observerList != null) {
            for (IObserver observer : observerList) {
                observer.update(notifications.get(notificationType));
            }
        }
    }
}

