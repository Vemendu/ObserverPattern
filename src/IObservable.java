public interface IObservable {
    void newMessage(String message);
    void deletedMessage(int messageId);
    void registerObserver(IObserver observer);
    void unregisterObserver(IObserver observer);
    void notifyAllObservers(IObserver observer);
    void notifyAllObservers(String message);
    void notifyAllObservers(int messageId);
}
