package comportamental.observer;

public class Internet implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Notificando via Internet" + " -> " + subject.toString());
    }
}
