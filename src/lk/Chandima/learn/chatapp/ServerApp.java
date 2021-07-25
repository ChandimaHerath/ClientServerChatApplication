package lk.Chandima.learn.chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    public static void main(String[] args)  {

        try (ServerSocket serverSocket = new ServerSocket(7070)) {
            System.out.println("Server Started....!");

           while(true){

               System.out.println("listing to incoming Clients....!");
               Socket localSocket = serverSocket.accept();

               new Thread(() -> {

                   try (InputStream is = localSocket.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr))
                   {
                       String line = null;
                       while((line = br.readLine())!=null){
                           System.out.println(line);

                       }

                   }

                   catch (IOException e) {
                       e.printStackTrace();
                   }

               }).start();
           }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Server Is Shutting Down");

    }




}
