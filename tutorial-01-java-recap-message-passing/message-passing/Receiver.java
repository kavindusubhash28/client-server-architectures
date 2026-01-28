
public class Receiver {
    public void receiveMessage(Message message) {
        System.out.println("Message received: " + message.getContent());
    }
}