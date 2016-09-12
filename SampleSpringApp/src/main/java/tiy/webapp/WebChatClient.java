package tiy.webapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Brice on 9/12/16.
 */
public class WebChatClient {

    String serverResponse;

    public String SendMessage(String message) {
        try {
            Socket clientSocket = new Socket("localhost", 8005);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

//            while (true) {
                out.println(message);

//                System.out.println(in.readLine());
            serverResponse = in.readLine();

//            clientSocket.close();

//            }
        } catch (IOException ex) {
        }
//        return null;
        return serverResponse;
    }
}