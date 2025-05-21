import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;

    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            input = new BufferedReader(new InputStreamReader(System.in));
            output = new PrintWriter(socket.getOutputStream(), true);

            new Thread(new Listener()).start();
            runClient();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void runClient() {
        String userInput;
        try {
            while (true) {
                userInput = input.readLine();
                output.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private class Listener implements Runnable {
        public void run() {
            try {
                BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String serverResponse;
                while ((serverResponse = serverInput.readLine()) != null) {
                    System.out.println(serverResponse);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client("localhost", 1234);
    }
}
