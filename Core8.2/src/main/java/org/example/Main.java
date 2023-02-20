package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())))
         {



            Scanner scanner = new Scanner(System.in);

            System.out.println("Write your name");
            while(true) {
            String s = scanner.nextLine();
            out.println(s);

            String sv = in.readLine();
            System.out.println(sv);


            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}