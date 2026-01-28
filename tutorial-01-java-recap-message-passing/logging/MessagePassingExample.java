

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessagePassingExample {
    public static void main(String[] args) {
        try {
            // Configure the logger
            configureLogger();

            // Create instances of Sender and Receiver
            Sender sender = new Sender();
            Receiver receiver = new Receiver();

            // Sender creates a message
            Message message = sender.createMessage("Hello, Receiver!");

            // Sender sends the message to the Receiver
            sender.sendMessage(message, receiver);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "Error in MessagePassingExample: " + e.getMessage(), e);
        }
    }

    private static void configureLogger() {
        try {
            // Configure global logging level
            Logger globalLogger = Logger.getLogger("");
            Handler[] handlers = globalLogger.getHandlers();
            for (Handler handler : handlers) {
                globalLogger.removeHandler(handler);
            }
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            globalLogger.addHandler(consoleHandler);
            globalLogger.setLevel(Level.ALL);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "Error configuring logger: " + e.getMessage(), e);
        }
    }
}