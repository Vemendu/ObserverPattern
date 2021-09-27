import java.util.LinkedList;
import java.util.List;

public class User implements IObserver{
    private String name;
    List<String> list = new LinkedList<String>();
    IObservable observable;
    public User(String name, IObservable observable) {
        setName(name);
        observable.registerObserver(this);
        this.observable=observable;
    }

    @Override
    public void sendMessage(String message)
    {
        observable.newMessage(message);
    }

    @Override
    public void deleteMessageForYourself(int messageId)
    {
        list.remove(messageId);
    }

    @Override
    public void deleteMessageForEveryone(int messageId)
    {
        observable.deletedMessage(messageId);
    }

    @Override
    public void update(String message) {
        this.list.add(message);
        System.out.println(getName() + " received a message! " + message);
    }

    @Override
    public void update(int messageId) {
        this.list.remove(messageId);
        System.out.println(getName() + ", a message was deleted! Its index was " + messageId);
    }

    @Override
    public void update(IObserver observer) {
        System.out.println(getName() + ", user " + observer.getName() + " left!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
