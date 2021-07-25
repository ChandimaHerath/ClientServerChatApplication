package lk.Chandima.learn.chatapp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        try (Socket clientSocket = new Socket("localhost", 7071)) {
            System.out.println("Enter Your Name:");
            String name = scanner.nextLine();

            try (OutputStream outputStream = clientSocket.getOutputStream();
                 OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                 BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {


                while (true) {

                    System.out.println("Enter Your Message:");
                    String message = scanner.nextLine();

                    if (message.equalsIgnoreCase("exit")) {
                        System.exit(0);

                    }

                    bufferedWriter.write(name + ":" + message);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                }

            } catch (IOException e) {

                e.printStackTrace();
            }


        }
    }
}
