import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        final String serverAddress = "local port";
        final int serverPort = 12345;

        // TODO 16: Open a socket connection to localhost:12345
        try (Socket socket = new Socket(serverAddress, serverPort)) {

            // TODO 17: Create PrintWriter for output
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(),true );
            
            // TODO 18: Create BufferedReader for input
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // TODO 19: Send "Hello from client" to the server
            output.println("Hello from subhash");

            // TODO 20: Read the response line from the server
            String serverResponse = input.readLine();

            System.out.println("Received from server: " + serverResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
