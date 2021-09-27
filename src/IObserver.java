public interface IObserver {
String getName();
void update(IObserver observer);
void update(String message);
void update(int messageId);
void sendMessage(String message);
void deleteMessageForYourself(int messageId);
void deleteMessageForEveryone(int messageId);
}
