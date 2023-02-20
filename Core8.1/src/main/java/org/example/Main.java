package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("server started");
        int port = 8089;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))


                ) {
                    List<String> list = new ArrayList<>();

                    System.out.printf("New connection accepted. Port %d%n", clientSocket.getPort());
                    String name = in.readLine();


                    while (name != null) {
                        out.println(String.format("Hi %s, you port is %d. Write you surname", name, clientSocket.getPort()));
                        name = in.readLine();
                        list.add("name");
                        out.println(String.format("I remember. How ol are you?"));
                        name = in.readLine();
                        list.add("name");
                        out.println("Buy");
                        name = null;
                    }



                }
            }
        }
    }
}