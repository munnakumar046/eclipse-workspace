package com.munna.www;

import java.io.*;
import java.net.*;

public class ChatClient {
    // Replace "localhost" with the desired server IP address or domain
	private static final String SERVER_ADDRESS = "192.168.1.10";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.1.10", 12345);
             BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to chat server at " + SERVER_ADDRESS);
            
            Thread receiveMessages = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println("Server: " + serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveMessages.start();

            String message;
            while ((message = input.readLine()) != null) {
                out.println(message);  // Send message to server
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
