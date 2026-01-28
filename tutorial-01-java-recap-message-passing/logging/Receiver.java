

import java.util.logging.Level;
import java.util.logging.Logger;

public class Receiver {
    private static final Logger logger = Logger.getLogger(Receiver.class.getName());

    public void receiveMessage(Message message) {
        try {
            logger.log(Level.INFO, "Message received: " + message.getContent());
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error receiving message: " + e.getMessage(), e);
            // Handle or rethrow the exception based on your application's needs
        }
    }
}
