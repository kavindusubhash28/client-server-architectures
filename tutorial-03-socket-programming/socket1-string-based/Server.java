import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class Server {

    public static void main(String[] args) {

        final int portNumber = 12345;

        // Create ServerSocket using try-with-resources
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {

            System.out.println("Server is listening on port " + portNumber);

            // Keep server running to accept multiple clients
            while (true) {

                // Wait for client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Read data from client
                BufferedReader input = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream())
                );

                // Send data to client (autoFlush enabled)
                PrintWriter output = new PrintWriter(
                        clientSocket.getOutputStream(), true
                );

                // Read message from client
                String clientMessage = input.readLine();
                System.out.println("Received from client: " + clientMessage);

                // Send response to client
                output.println("Hello from server");

                // Close client connection
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
