package comportamental.observer;

public class TV implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Notificando via TV" + " -> " + subject.toString());
    }
}
