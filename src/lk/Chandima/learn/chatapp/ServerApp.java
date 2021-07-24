package lk.Chandima.learn.chatapp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    public static void main(String[] args)  {

//        ServerSocket serverSocket = new ServerSocket(7575);
//        System.out.println("Server Initiated...!");
//
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            if(!serverSocket.isClosed()){
//                try {
//                    serverSocket.close();
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }));
//
//        while (true) {
//            //returns the local socket of the server
//            System.out.println("Server is Listening for Incoming Connections....");
//            try {
//                Socket localSocket = serverSocket.accept();
//            } catch (IOException e) {
//
//                if(serverSocket.isClosed()){
//                    break;
//                }
//            }
//
//
//        }
//
//        System.out.println("Server is Shutting Down..!");
//

        try (ServerSocket serverSocket = new ServerSocket(7575)) {
            System.out.println("Server Started....!");


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
