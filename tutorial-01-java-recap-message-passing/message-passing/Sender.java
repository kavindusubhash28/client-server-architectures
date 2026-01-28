
public class Sender {
    public Message createMessage(String content) {
        Message message = new Message(content);
        System.out.println("Message created: " + content);
        return message;
    }

    public void sendMessage(Message message, Receiver receiver) {
        System.out.println("Sending message to receiver...");
        receiver.receiveMessage(message);
    }
}