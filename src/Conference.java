import java.util.LinkedList;
import java.util.List;
import java.util.Observer;

public class Conference implements IObservable{

    List<IObserver> list = new LinkedList<>();
    List<String> messageHistory = new LinkedList<>();

    @Override
    public void newMessage(String message)
    {
        this.messageHistory.add(message);
        notifyAllObservers(message);

    }

    @Override
    public void deletedMessage(int messageId)
    {
        this.messageHistory.remove(messageId);
        notifyAllObservers(messageId);
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.list.add(observer);
    }

    @Override
    public void unregisterObserver(IObserver observer) {
        this.list.remove(observer);
        notifyAllObservers(observer);
    }

    @Override
    public void notifyAllObservers(IObserver observer) {
        for(IObserver user : list)
        {
            user.update(observer);
        }
    }

    @Override
    public void notifyAllObservers(String message) {
        for(IObserver user : list)
        {
            user.update(message);
        }
    }

    @Override
    public void notifyAllObservers(int messageId) {
        for(IObserver user : list)
        {
            user.update(messageId);
        }
    }

}
