
public class MessagePassingExample {
    public static void main(String[] args) {
        // Create instances of Sender and Receiver
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Sender creates a message
        Message message = sender.createMessage("Hello, Receiver!");

        // Sender sends the message to the Receiver
        sender.sendMessage(message, receiver);
    }
}
