package lk.Chandima.learn.chatapp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(7575);

        while (true) {
            Socket socket = serverSocket.accept();
        }



    }


}
