package main;

import java.net.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        
        try {
            ServerSocket servidor = new ServerSocket(4444);
            System.out.println("Aguardando cliente!");
            while (true) {
                Socket socket = servidor.accept(); // espera
                Server cliente = new Server(socket);
                System.out.println("Chegou um cliente!");
                cliente.start();
            }
        } catch (IOException e) {
            System.err.println("Problemas de IO");
        }
    }
}
