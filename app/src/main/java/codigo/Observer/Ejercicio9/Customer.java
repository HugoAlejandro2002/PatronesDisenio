package codigo.Observer.Ejercicio9;

public class Customer implements IObserver {

    private String name;
    private String[] notificationTypes;

    public Customer(String name, String[] notificationTypes) {
        this.name = name;
        this.notificationTypes = notificationTypes;
    }

    public String[] getNotificationTypes() {
        return notificationTypes;
    }

    @Override
    public void update(String notificationType) {
        System.out.println("Notificación recibida por " + name + ": " + notificationType);
    }
}

