package lk.Chandima.learn.chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

           while(true){

               System.out.println("listing to incoming Clients....!");
               Socket localSocket = serverSocket.accept();

               new Thread(() -> {

                   try (InputStream is = localSocket.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr))
                   {




                   }

                   catch (IOException e) {
                       e.printStackTrace();
                   }

               }).start();

           }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
