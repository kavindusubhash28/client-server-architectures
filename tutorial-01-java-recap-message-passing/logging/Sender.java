

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sender {
    private static final Logger logger = Logger.getLogger(Sender.class.getName());

    public Message createMessage(String content) {
        try {
            Message message = new Message(content);
            logger.log(Level.INFO, "Message created: " + content);
            return message;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error creating message: " + e.getMessage(), e);
            return null; // or throw a specific exception based on your application's needs
        }
    }

    public void sendMessage(Message message, Receiver receiver) {
        try {
            logger.log(Level.INFO, "Sending message to receiver...");
            receiver.receiveMessage(message);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error sending message: " + e.getMessage(), e);
            // Handle or rethrow the exception based on your application's needs
        }
    }
}